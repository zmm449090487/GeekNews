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
import com.example.demo.R;

import java.util.ArrayList;
import java.util.List;

import bean.ResultBean;

public class MyRecSelectAdapter extends RecyclerView.Adapter<MyRecSelectAdapter.ViewHolder> {
    private Context context;
    private ArrayList<ResultBean> list = new ArrayList<>();

    public MyRecSelectAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.rec_item_layout1,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final ResultBean resultBean = list.get(i);
        Glide.with(context).load(list.get(i).getAlbum_1000_1000()).into(viewHolder.img);
        viewHolder.title.setText(list.get(i).getAlbum_title());

        viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                onClick.OnClick(resultBean);
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addData(List<ResultBean> resultBeans) {
        if (list != null){
            list.clear();
            list.addAll(resultBeans);
        }
        notifyDataSetChanged();
    }

    public void delete(ResultBean resultBean) {
        if (list != null){
            list.remove(resultBean);
        }
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            title = itemView.findViewById(R.id.title);
        }
    }
    private OnClick onClick;

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    public interface OnClick{
        void OnClick(ResultBean resultBean);
    }
}
