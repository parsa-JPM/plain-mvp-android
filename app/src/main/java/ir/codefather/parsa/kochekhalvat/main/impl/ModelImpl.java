package ir.codefather.parsa.kochekhalvat.main.impl;

import ir.codefather.parsa.kochekhalvat.main.interfaces.MainModel;

class ModelImpl implements MainModel{

    @Override
    public void Login(OnFinish presenter) {
        presenter.success("parsa is best");
    }
}
