package com.whooli.wcfinder.data.account;

import android.content.Context;
import android.content.SharedPreferences;

import com.whooli.wcfinder.data.DataManager;
import com.whooli.wcfinder.utils.Constants;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppAccountManager implements AccountManager {

    private static final String PREF_KEY_USER_LOGGED_IN_MODE = "PREF_KEY_USER_LOGGED_IN_MODE";
    private static final String PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID";
    private static final String PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME";
    private static final String PREF_KEY_CURRENT_USER_EMAIL = "PREF_KEY_CURRENT_USER_EMAIL";
    private static final String PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";

    private final SharedPreferences prefs;

    @Inject
    public AppAccountManager(Context context, String prefFileName) {
        prefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }

    @Override
    public Long getCurrentUserId() {
        long userId = prefs.getLong(PREF_KEY_CURRENT_USER_ID, Constants.NULL_INDEX);
        return userId == Constants.NULL_INDEX ? null : userId;
    }

    @Override
    public void setCurrentUserId(Long userId) {
        long id = userId == null ? Constants.NULL_INDEX : userId;
        prefs.edit().putLong(PREF_KEY_CURRENT_USER_ID, id).apply();
    }

    @Override
    public String getCurrentUserName() {
        return prefs.getString(PREF_KEY_CURRENT_USER_NAME, null);
    }

    @Override
    public void setCurrentUserName(String userName) {
        prefs.edit().putString(PREF_KEY_CURRENT_USER_NAME, userName).apply();
    }

    @Override
    public String getCurrentUserEmail() {
        return prefs.getString(PREF_KEY_CURRENT_USER_EMAIL, null);
    }

    @Override
    public void setCurrentUserEmail(String email) {
        prefs.edit().putString(PREF_KEY_CURRENT_USER_EMAIL, email).apply();
    }

    @Override
    public int getCurrentUserLoginMode() {
        return prefs.getInt(PREF_KEY_USER_LOGGED_IN_MODE,
                DataManager.LoginMode.LOGGED_OUT.getMode());
    }

    @Override
    public void setCurrentUserLoginMode(DataManager.LoginMode mode) {
        prefs.edit().putInt(PREF_KEY_USER_LOGGED_IN_MODE, mode.getMode()).apply();
    }

    @Override
    public String getAccessToken() {
        return prefs.getString(PREF_KEY_ACCESS_TOKEN, null);
    }

    @Override
    public void setAccessToken(String accessToken) {
        prefs.edit().putString(PREF_KEY_ACCESS_TOKEN, accessToken).apply();
    }

}
