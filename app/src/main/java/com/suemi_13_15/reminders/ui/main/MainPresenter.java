package com.suemi_13_15.reminders.ui.main;

import java.util.List;

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;

    public MainPresenter(MainContract.View view) {
        this.view = view;

    }


    @Override
    public List<String> loadReminders() {
        return null;
    }
}
