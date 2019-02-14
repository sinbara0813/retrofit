package com.d2cmall.shopkeeper.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.d2cmall.shopkeeper.base.mvp.BasePresenter;
import com.d2cmall.shopkeeper.base.mvp.BaseView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 作者:Created by sinbara on 2019/2/13.
 * 邮箱:hrb940258169@163.com
 */

public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements BaseView {

    public Context mContext;
    public View rootView;
    public boolean isCreated;
    public boolean isVisibleToUser;
    private Unbinder unBinder;
    private P presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = getRootView(inflater,container,savedInstanceState);
        unBinder= ButterKnife.bind(this, rootView);
        isCreated = true;
        return rootView;
    }

    public abstract View getRootView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.isVisibleToUser = isVisibleToUser;
        if (isVisibleToUser) {
            onVisible();
        } else {
            onInVisible();
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        prepareView();
        if (isVisibleToUser){
            doBusiness();
        }
    }

    @Override
    public void onAttach(Context context) {
        mContext=context;
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mContext=null;
    }

    public void onVisible() {
        if (!isCreated || !isVisibleToUser)
            return;
        doBusiness();
    }

    /**
     * 预处理view 对象初始化,为滚动view设置适配器等
     */
    public abstract void prepareView();

    public void onInVisible() {
        if (!isCreated)
            return;
        releaseOnInVisible();
    }

    /**
     * 处理业务 加载数据等
     */
    public abstract void doBusiness();

    protected abstract P createPresenter();

    public void releaseOnInVisible(){};

    @Override
    public void onDestroyView() {
        unBinder.unbind();
        isCreated=false;
        super.onDestroyView();
    }
}
