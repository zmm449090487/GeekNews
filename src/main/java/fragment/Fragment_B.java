package fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.demo.R;

import java.util.List;

import adapter.MyRecAdapter;
import adapter.MyRecSelectAdapter;
import bean.ResultBean;
import db.DBUtls;

public class Fragment_B extends Fragment {
    private View view;
    private RecyclerView mRec;
    private MyRecSelectAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, null);
        initView(view);
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if (isVisibleToUser){
            initData();
        }
        super.setUserVisibleHint(isVisibleToUser);
    }

    private void initData() {
        List<ResultBean> resultBeans = DBUtls.queryAll();
        adapter.addData(resultBeans);

    }

    private void initView(View view) {
        mRec = (RecyclerView) view.findViewById(R.id.rec);

        mRec.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new MyRecSelectAdapter(getActivity());
        mRec.setAdapter(adapter);

        adapter.setOnClick(new MyRecSelectAdapter.OnClick() {
            @Override
            public void OnClick(ResultBean resultBean) {
                DBUtls.delete(resultBean);
                adapter.delete(resultBean);
                Toast.makeText(getActivity(), "删除成功", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
