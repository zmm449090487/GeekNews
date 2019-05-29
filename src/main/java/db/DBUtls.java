package db;

import com.example.sqlliteopenhelperdemo2.dao.DaoSession;
import com.example.sqlliteopenhelperdemo2.dao.ResultBeanDao;

import java.util.List;

import bean.ResultBean;

public class DBUtls {
    public static void insert(ResultBean resultBean){
        DaoSession daoSession = MyApplication.getDaoSession();
        if (queryOne(resultBean) == null){
            daoSession.insert(resultBean);
        }
    }

    public static void delete(ResultBean resultBean){
        DaoSession daoSession = MyApplication.getDaoSession();
        if (queryOne(resultBean) != null){
            daoSession.delete(resultBean);
        }
    }


    public static List<ResultBean> queryAll(){
        DaoSession daoSession = MyApplication.getDaoSession();
        return daoSession.loadAll(ResultBean.class);
    }


    public static ResultBean queryOne(ResultBean resultBean){
        DaoSession daoSession = MyApplication.getDaoSession();
        return daoSession.queryBuilder(ResultBean.class)
                .where(ResultBeanDao.Properties.Album_id.eq(resultBean.getAlbum_id()))
                .build()
                .unique();
    }
}
