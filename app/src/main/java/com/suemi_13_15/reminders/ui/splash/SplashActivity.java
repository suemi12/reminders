package com.suemi_13_15.reminders.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.suemi_13_15.reminders.R;

public class SplashActivity extends AppCompatActivity implements SplashContract.View {

    private SplashContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        presenter = new SplashPresenter(this);

    }

    @Override
    public void delegateContinueAction() {
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
        finish();
    }
}
