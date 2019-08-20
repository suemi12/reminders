package com.suemi_13_15.reminders.ui.splash;

import android.os.Handler;

public class SplashPresenter implements SplashContract.Presenter, Runnable {

    private final long SPLASH_DELAY = 3000;
    private SplashContract.View view;

    public SplashPresenter(SplashContract.View view) {
        this.view = view;

    }

    @Override
    public void showProgress() {
        //SE DECLARA Y SE ASIGNA UN HANDLER
        Handler handler = new Handler();
        //(Runnable r,long delayMillis)
        handler.postDelayed(this, SPLASH_DELAY);
    }

    @Override
    public void run() {
        view.delegateContinueAction();
    }
}
