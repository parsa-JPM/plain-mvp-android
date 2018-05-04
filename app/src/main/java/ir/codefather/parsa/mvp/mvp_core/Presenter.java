package ir.codefather.parsa.mvp.mvp_core;

public abstract class Presenter<V, M> {
    protected V view;
    protected M model;

    public Presenter(V view, M model) {
        if (view == null)
            throw new NullPointerException("view you passed to presenter is null");
        if ( model == null)
            throw new NullPointerException("model you passed to presenter is null");
        this.view = view;
        this.model = model;
    }
}
