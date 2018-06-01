package com.whooli.wcfinder.ui.splash;

import com.whooli.wcfinder.data.DataManager;
import com.whooli.wcfinder.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class SplashPresenter<V extends SplashIView> extends BasePresenter<V> implements SplashIPresenter<V> {

    @Inject
    public SplashPresenter(DataManager dataManager, CompositeDisposable compositeDisposable) {
        super(dataManager, compositeDisposable);
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);

        decideNextActivity();
    }

    private void decideNextActivity() {
        if (getDataManager().getCurrentUserLoginMode()
                == DataManager.LoginMode.LOGGED_OUT.getMode()) {
            getMvpView().openLoginActivity();
        } else {
            getMvpView().openMainActivity();
        }
    }
}
