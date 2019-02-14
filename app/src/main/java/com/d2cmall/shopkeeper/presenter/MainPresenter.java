package com.d2cmall.shopkeeper.presenter;

import com.d2cmall.shopkeeper.base.mvp.BaseModel;
import com.d2cmall.shopkeeper.base.mvp.BaseObserver;
import com.d2cmall.shopkeeper.base.mvp.BasePresenter;
import com.d2cmall.shopkeeper.model.MainTagBean;
import com.d2cmall.shopkeeper.view.MainView;

/**
 * 作者:Created by sinbara on 2019/2/13.
 * 邮箱:hrb940258169@163.com
 */

public class MainPresenter extends BasePresenter<MainView> {

    public MainPresenter(MainView baseView) {
        super(baseView);
    }

    public void getMainTag(){
        addDisposable(apiServer.getMainTag("HOME"), new BaseObserver<BaseModel<MainTagBean>>(baseView) {
            @Override
            public void onSuccess(BaseModel<MainTagBean> o) {
                baseView.getMainTagSuccess(o.getData());
            }

        });
    }
}
