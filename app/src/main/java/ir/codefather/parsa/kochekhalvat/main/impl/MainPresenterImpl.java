package ir.codefather.parsa.kochekhalvat.main.impl;

import ir.codefather.parsa.kochekhalvat.main.interfaces.MainModel;
import ir.codefather.parsa.kochekhalvat.main.interfaces.MainPresenter;
import ir.codefather.parsa.kochekhalvat.main.interfaces.MainView;
import ir.codefather.parsa.kochekhalvat.mvp_core.Presenter;

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
