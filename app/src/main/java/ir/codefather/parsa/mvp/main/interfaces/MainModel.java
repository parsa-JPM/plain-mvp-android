package ir.codefather.parsa.mvp.main.interfaces;

public interface MainModel {
    /**
     * call this listener by presenter
     */
    public interface OnFinish {
        void success(String result);
    }

    void Login(OnFinish presenter);
}
