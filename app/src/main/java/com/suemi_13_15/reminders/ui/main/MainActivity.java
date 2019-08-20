package com.suemi_13_15.reminders.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.suemi_13_15.reminders.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);
    }

    @Override
    public void showProgress(boolean show) {
        View progress = findViewById(R.id.ly_progress);
        if (show)
            progress.setVisibility(View.VISIBLE);
        else
            progress.setVisibility(View.GONE);

    }

    @Override
    public void showReminders(List<String> Reminders) {

    }
}
