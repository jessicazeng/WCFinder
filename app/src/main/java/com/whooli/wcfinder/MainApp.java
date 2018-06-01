package com.whooli.wcfinder;

import android.app.Application;

import com.whooli.wcfinder.data.DataManager;
import com.whooli.wcfinder.inject.component.AppComponent;
import com.whooli.wcfinder.inject.component.DaggerAppComponent;
import com.whooli.wcfinder.inject.module.AppModule;

import javax.inject.Inject;

public class MainApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this)).build();

        appComponent.inject(this);
    }

    public AppComponent getComponent() {
        return appComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(AppComponent appComponent) {
        appComponent = appComponent;
    }

}
