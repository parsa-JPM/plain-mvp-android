package ir.codefather.parsa.kochekhalvat.main.impl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import ir.codefather.parsa.kochekhalvat.R;
import ir.codefather.parsa.kochekhalvat.main.interfaces.MainPresenter;
import ir.codefather.parsa.kochekhalvat.main.interfaces.MainView;

public class MainActivity extends AppCompatActivity implements MainView {

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenterImpl(this, new ModelImpl());
        presenter.vlidation();
    }

    @Override
    public void showMessage(String str) {
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();
    }
}
