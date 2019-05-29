package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.demo.R;

import java.util.ArrayList;
import java.util.List;

import bean.ResultBean;

public class MyRecAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<ResultBean> list = new ArrayList<>();

    public MyRecAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0){
            View view = LayoutInflater.from(context).inflate(R.layout.rec_item_layout1,null);
            return new ViewHolder1(view);
        }else {
            View view = LayoutInflater.from(context).inflate(R.layout.rec_item_layout2,viewGroup,false);
            return new ViewHolder2(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        final ResultBean resultBean = list.get(i);

        int type = getItemViewType(i);
        if (type == 0){
            ViewHolder1 holder1 = (ViewHolder1) viewHolder;
            RequestOptions options = new RequestOptions().circleCrop();
            Glide.with(context).load(list.get(i).getAlbum_1000_1000()).apply(options).into(holder1.img);
            holder1.title.setText(list.get(i).getAlbum_title());
        }else {
            ViewHolder2 holder2 = (ViewHolder2) viewHolder;
            RoundedCorners roundedCorners = new RoundedCorners(30);
            RequestOptions options = RequestOptions.bitmapTransform(roundedCorners);
            Glide.with(context).load(list.get(i).getAlbum_500_500()).apply(options).into(holder2.img2);
        }

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick.OnClick(resultBean);
            }
        });

        viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                onClick.OnLongClick(resultBean);
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position%2 == 0){
            return 0;
        }else {
            return 1;
        }
    }

    public void addData(List<ResultBean> resultBeans) {
        if (list != null){
            list.clear();
            list.addAll(resultBeans);
        }
        notifyDataSetChanged();
    }

    class ViewHolder1 extends RecyclerView.ViewHolder{

        ImageView img;
        TextView title;
        public ViewHolder1(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            title = itemView.findViewById(R.id.title);
        }
    }

    class ViewHolder2 extends RecyclerView.ViewHolder{

        ImageView img2;
        public ViewHolder2(@NonNull View itemView) {
            super(itemView);
            img2 = itemView.findViewById(R.id.img2);
        }
    }
    private OnClick onClick;

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    public interface OnClick{
        void OnClick(ResultBean resultBean);
        void OnLongClick(ResultBean resultBean);
    }
}
