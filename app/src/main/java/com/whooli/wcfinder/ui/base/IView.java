package com.whooli.wcfinder.ui.base;

public interface IView {

    void showLoading();

    void hideLoading();

    void onError(String message);

    void showMessage(String message);

}
