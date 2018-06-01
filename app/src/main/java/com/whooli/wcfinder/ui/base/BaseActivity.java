package com.whooli.wcfinder.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.whooli.wcfinder.MainApp;
import com.whooli.wcfinder.inject.component.ActivityComponent;
import com.whooli.wcfinder.inject.component.DaggerActivityComponent;
import com.whooli.wcfinder.inject.module.ActivityModule;

import butterknife.Unbinder;

public class BaseActivity extends AppCompatActivity implements IView {

    private ActivityComponent activityComponent;

    private Unbinder unBinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .appComponent(((MainApp) getApplication()).getComponent())
                .build();
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }

    public void setUnBinder(Unbinder unBinder) {
        unBinder = unBinder;
    }

    @Override
    protected void onDestroy() {

        if (unBinder != null) {
            unBinder.unbind();
        }
        super.onDestroy();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void showMessage(String message) {

    }
}
