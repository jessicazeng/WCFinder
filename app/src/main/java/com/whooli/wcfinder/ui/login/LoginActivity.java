package com.whooli.wcfinder.ui.login;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.whooli.wcfinder.R;
import com.whooli.wcfinder.ui.base.BaseActivity;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity implements LoginIView {

    @Inject
    LoginIPresenter<LoginIView> presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
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
