package ir.codefather.parsa.mvp.main.impl;

import ir.codefather.parsa.mvp.main.interfaces.MainModel;

class ModelImpl implements MainModel{

    @Override
    public void Login(OnFinish presenter) {
        presenter.success("plain mvp project");
    }
}
