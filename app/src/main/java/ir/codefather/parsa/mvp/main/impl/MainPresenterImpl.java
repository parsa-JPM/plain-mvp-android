package ir.codefather.parsa.mvp.main.impl;

import ir.codefather.parsa.mvp.main.interfaces.MainModel;
import ir.codefather.parsa.mvp.main.interfaces.MainPresenter;
import ir.codefather.parsa.mvp.main.interfaces.MainView;
import ir.codefather.parsa.mvp.mvp_core.Presenter;

public class MainPresenterImpl extends Presenter<MainView, ModelImpl> implements MainPresenter,
        MainModel.OnFinish {

    MainPresenterImpl(MainView view, ModelImpl model) {
        super(view, model);
    }

    @Override
    public void vlidation() {
        model.Login(this);
    }

    @Override
    public void success(String result) {
        view.showMessage(result);
    }
}
