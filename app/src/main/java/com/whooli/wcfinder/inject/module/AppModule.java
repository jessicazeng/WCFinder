package com.whooli.wcfinder.inject.module;

import android.app.Application;
import android.content.Context;

import com.whooli.wcfinder.data.AppDataManager;
import com.whooli.wcfinder.data.DataManager;
import com.whooli.wcfinder.data.account.AccountManager;
import com.whooli.wcfinder.data.account.AppAccountManager;
import com.whooli.wcfinder.utils.Constants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final Application app;

    public AppModule(Application app) {
        this.app = app;
    }

    @Provides
    Context provideContext() {
        return app;
    }

    @Provides
    Application provideApplication() {
        return app;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    AccountManager provideAccountManager(AppAccountManager accountManager) {
        return accountManager;
    }

    @Provides
    String providePreferenceName() {
        return Constants.PREF_NAME;
    }

}
