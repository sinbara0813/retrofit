package com.d2cmall.shopkeeper.ui.activity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.d2cmall.shopkeeper.R;
import com.d2cmall.shopkeeper.base.BaseActivity;
import com.d2cmall.shopkeeper.base.mvp.BaseModel;
import com.d2cmall.shopkeeper.model.MainTagBean;
import com.d2cmall.shopkeeper.presenter.MainPresenter;
import com.d2cmall.shopkeeper.utils.App;
import com.d2cmall.shopkeeper.view.MainView;

import butterknife.BindView;

public class MainActivity extends BaseActivity<MainPresenter> implements MainView {

    @BindView(R.id.info)
    TextView info;
    @BindView(R.id.request)
    Button request;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void doBusiness() {
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.getMainTag();
            }
        });
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void requestStart() {

    }

    @Override
    public void requestFinish() {

    }

    @Override
    public void getMainTagSuccess(MainTagBean mainTagBean) {
        info.setText(mainTagBean.toString());
    }
}
