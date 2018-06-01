package com.whooli.wcfinder.data.account;

import com.whooli.wcfinder.data.DataManager;

public interface AccountManager {

    int getCurrentUserLoginMode();

    void setCurrentUserLoginMode(DataManager.LoginMode mode);

    Long getCurrentUserId();

    void setCurrentUserId(Long userId);

    String getCurrentUserName();

    void setCurrentUserName(String userName);

    String getCurrentUserEmail();

    void setCurrentUserEmail(String email);

    String getAccessToken();

    void setAccessToken(String accessToken);

}
