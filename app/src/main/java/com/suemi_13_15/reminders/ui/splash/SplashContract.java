package com.suemi_13_15.reminders.ui.splash;

public interface SplashContract {

    interface View {
        void delegateContinueAction();
    }

    interface Presenter {
        void showProgress();
    }
}
