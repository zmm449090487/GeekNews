package view;

import java.util.List;

import bean.ResultBean;

public interface ICallback {
    void updataSuccess(List<ResultBean> resultBeans);
    void updataError(String error);
}
