package com.whooli.wcfinder.inject.component;

import com.whooli.wcfinder.inject.PerActivity;
import com.whooli.wcfinder.inject.module.ActivityModule;
import com.whooli.wcfinder.ui.login.LoginActivity;
import com.whooli.wcfinder.ui.main.MainActivity;
import com.whooli.wcfinder.ui.splash.SplashActivity;

import javax.inject.Scope;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(SplashActivity activity);

    void inject(MainActivity activity);

    void inject(LoginActivity activity);

}
