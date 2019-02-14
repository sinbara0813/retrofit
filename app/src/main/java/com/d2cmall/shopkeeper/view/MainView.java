package com.d2cmall.shopkeeper.view;

import com.d2cmall.shopkeeper.base.mvp.BaseView;
import com.d2cmall.shopkeeper.model.MainTagBean;

/**
 * 作者:Created by sinbara on 2019/2/13.
 * 邮箱:hrb940258169@163.com
 */

public interface MainView extends BaseView{

    void getMainTagSuccess(MainTagBean mainTagBean);

}
