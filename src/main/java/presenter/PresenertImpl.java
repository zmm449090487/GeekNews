package presenter;

import java.util.List;

import bean.ResultBean;
import model.ModelImpl;
import view.ICallback;
import view.IView;

public class PresenertImpl implements IPresener{
    private final ModelImpl model;
    IView view;

    public PresenertImpl(IView view) {
        this.view = view;
        model = new ModelImpl();
    }

    @Override
    public void updataData() {
        model.updataData(new ICallback() {
            @Override
            public void updataSuccess(List<ResultBean> resultBeans) {
                view.updataSuccess(resultBeans);
            }

            @Override
            public void updataError(String error) {
                view.updataError(error);
            }
        });
    }
}
