package com.whooli.wcfinder.inject.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.whooli.wcfinder.ui.login.LoginIPresenter;
import com.whooli.wcfinder.ui.login.LoginIView;
import com.whooli.wcfinder.ui.login.LoginPresenter;
import com.whooli.wcfinder.ui.main.MainIPresenter;
import com.whooli.wcfinder.ui.main.MainIView;
import com.whooli.wcfinder.ui.main.MainPresenter;
import com.whooli.wcfinder.ui.splash.SplashIPresenter;
import com.whooli.wcfinder.ui.splash.SplashIView;
import com.whooli.wcfinder.ui.splash.SplashPresenter;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class ActivityModule {

    private AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    Context provideContext() {
        return activity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return activity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SplashIPresenter<SplashIView> provideSplashPresenter(
            SplashPresenter<SplashIView> presenter) {
        return presenter;
    }

    @Provides
    LoginIPresenter<LoginIView> provideLoginPresenter(
            LoginPresenter<LoginIView> presenter) {
        return presenter;
    }

    @Provides
    MainIPresenter<MainIView> provideMainPresenter(
            MainPresenter<MainIView> presenter) {
        return presenter;
    }

}
