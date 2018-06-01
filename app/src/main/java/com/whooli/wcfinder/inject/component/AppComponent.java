package com.whooli.wcfinder.inject.component;

import android.app.Application;
import android.content.Context;

import com.whooli.wcfinder.MainApp;
import com.whooli.wcfinder.data.DataManager;
import com.whooli.wcfinder.inject.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MainApp mainApp);

    Context context();

    Application application();

    DataManager getDataManager();

}
