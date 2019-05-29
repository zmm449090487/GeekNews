package fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.demo.R;

public class Fragment_A extends Fragment implements View.OnClickListener {
    private View view;
    private TabLayout mTl;
    private FrameLayout mFl;
    private FragmentManager fm;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, null);
        initView(view);
        initTab();
        initFragment();
        return view;
    }

    private void initFragment() {
        fm = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fl,new Fragment_Zx1());
        transaction.commit();
    }

    private void initTab() {

        mTl.addTab(mTl.newTab().setText("资讯列表"));
        mTl.addTab(mTl.newTab().setText("资讯详情"));


        mTl.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position == 0){
                    FragmentTransaction transaction = fm.beginTransaction();
                    transaction.replace(R.id.fl,new Fragment_Zx1());
                    transaction.commit();
                }else {
                    FragmentTransaction transaction = fm.beginTransaction();
                    transaction.replace(R.id.fl,new Fragment_Zx2());
                    transaction.commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void initView(View view) {
        mTl = (TabLayout) view.findViewById(R.id.tl);
        mTl.setOnClickListener(this);
        mFl = (FrameLayout) view.findViewById(R.id.fl);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.tl:
                break;
        }
    }
}
