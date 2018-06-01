package com.whooli.wcfinder.ui.base;

public interface IPresenter<V extends IView> {

    void onAttach(V view);

    void onDetach();

}
