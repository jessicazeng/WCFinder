package com.whooli.wcfinder.data;

import android.content.Context;

import com.whooli.wcfinder.data.account.AccountManager;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AppDataManager implements DataManager {

    private final Context context;
    private final AccountManager accountManager;

    @Inject
    public AppDataManager(Context context, AccountManager accountManager) {
        this.context = context;
        this.accountManager = accountManager;
    }

    @Override
    public void setUserAsLoggedOut() {

    }

    @Override
    public int getCurrentUserLoginMode() {
        return 0;
    }

    @Override
    public void setCurrentUserLoginMode(LoginMode mode) {

    }

    @Override
    public Long getCurrentUserId() {
        return null;
    }

    @Override
    public void setCurrentUserId(Long userId) {

    }

    @Override
    public String getCurrentUserName() {
        return null;
    }

    @Override
    public void setCurrentUserName(String userName) {

    }

    @Override
    public String getCurrentUserEmail() {
        return null;
    }

    @Override
    public void setCurrentUserEmail(String email) {

    }

    @Override
    public String getAccessToken() {
        return null;
    }

    @Override
    public void setAccessToken(String accessToken) {

    }

//    @Override
//    public Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest
//                                                              request) {
//        return mApiHelper.doGoogleLoginApiCall(request);
//    }

//    @Override
//    public Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest
//                                                              request) {
//        return mApiHelper.doServerLoginApiCall(request);
//    }

//    @Override
//    public int getCurrentUserLoggedInMode() {
//        return mPreferencesHelper.getCurrentUserLoggedInMode();
//    }
//
//    @Override
//    public void setCurrentUserLoggedInMode(LoggedInMode mode) {
//        mPreferencesHelper.setCurrentUserLoggedInMode(mode);
//    }
//
//    @Override
//    public Long getCurrentUserId() {
//        return mPreferencesHelper.getCurrentUserId();
//    }
//
//    @Override
//    public void setCurrentUserId(Long userId) {
//        mPreferencesHelper.setCurrentUserId(userId);
//    }
//
//    @Override
//    public String getCurrentUserName() {
//        return mPreferencesHelper.getCurrentUserName();
//    }
//
//    @Override
//    public void setCurrentUserName(String userName) {
//        mPreferencesHelper.setCurrentUserName(userName);
//    }
//
//    @Override
//    public String getCurrentUserEmail() {
//        return mPreferencesHelper.getCurrentUserEmail();
//    }
//
//    @Override
//    public void setCurrentUserEmail(String email) {
//        mPreferencesHelper.setCurrentUserEmail(email);
//    }
}
