package com.whooli.wcfinder.data;

import com.whooli.wcfinder.data.account.AccountManager;

public interface DataManager extends AccountManager {

    void setUserAsLoggedOut();

    enum LoginMode {

        LOGGED_OUT(0),
        LOGGED_IN(1);

        private final int mode;

        LoginMode(int mode) {
            this.mode = mode;
        }

        public int getMode() {
            return mode;
        }
    }

}
