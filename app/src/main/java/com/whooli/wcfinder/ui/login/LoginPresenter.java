package com.whooli.wcfinder.ui.login;

import com.whooli.wcfinder.data.DataManager;
import com.whooli.wcfinder.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class LoginPresenter<V extends LoginIView> extends BasePresenter<V> implements LoginIPresenter<V> {

    @Inject
    public LoginPresenter(DataManager dataManager, CompositeDisposable compositeDisposable) {
        super(dataManager, compositeDisposable);
    }

}
