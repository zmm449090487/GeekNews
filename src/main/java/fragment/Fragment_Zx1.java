package fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.demo.R;
import com.example.demo.WebViewActivity;
import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import adapter.MyRecAdapter;
import bean.BannerBean;
import bean.ResultBean;
import db.DBUtls;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import presenter.PresenertImpl;
import view.IView;

public class Fragment_Zx1 extends Fragment implements IView {
    private View view;
    private Banner mMyBanner;
    private RecyclerView mRec;
    private ArrayList<BannerBean.DataBean> bannerList;
    private MyRecAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zx1, null);
        initView(view);
        initBanner();
        initMvp();
        return view;
    }

    private void initMvp() {
        PresenertImpl presenert = new PresenertImpl(this);
        presenert.updataData();
    }

    private static final String TAG = "Fragment_Zx1";
    private void initBanner() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://www.wanandroid.com/banner/json")
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, "onFailure: "+e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String string = response.body().string();
                Log.d(TAG, "onResponse: "+string);
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        BannerBean bannerBean = new Gson().fromJson(string, BannerBean.class);
                        List<BannerBean.DataBean> data = bannerBean.getData();

                        bannerList = new ArrayList<>();
                        bannerList.addAll(data);
                        mMyBanner.setImages(bannerList).setImageLoader(new MyImage()).start();
                    }
                });
            }
        });

    }

    private void initView(View view) {
        mMyBanner = (Banner) view.findViewById(R.id.myBanner);
        mRec = (RecyclerView) view.findViewById(R.id.rec);

        mRec.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyRecAdapter(getActivity());
        mRec.setAdapter(adapter);

        adapter.setOnClick(new MyRecAdapter.OnClick() {
            @Override
            public void OnClick(ResultBean resultBean) {
                String link = resultBean.getPic_small();
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("link",link);
                startActivity(intent);
            }

            @Override
            public void OnLongClick(ResultBean resultBean) {
                DBUtls.insert(resultBean);
                Toast.makeText(getActivity(), "添加成功", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void updataSuccess(List<ResultBean> resultBeans) {
        adapter.addData(resultBeans);
    }

    @Override
    public void updataError(String error) {
        Log.d(TAG, "updataError: "+error);
    }

    public class MyImage extends ImageLoader{

        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            BannerBean.DataBean  banner = (BannerBean.DataBean) path;
            Glide.with(context).load(banner.getImagePath()).into(imageView);
        }
    }
}
