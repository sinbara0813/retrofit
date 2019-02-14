package com.d2cmall.shopkeeper.api;

import com.d2cmall.shopkeeper.base.mvp.BaseModel;
import com.d2cmall.shopkeeper.model.MainTagBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * 作者:Created by sinbara on 2019/2/13.
 * 邮箱:hrb940258169@163.com
 */

public interface ApiServer {

    @GET("/v3/api/page/index/{tag}")
    Observable<BaseModel<MainTagBean>> getMainTag(@Path("tag") String tag);

}
