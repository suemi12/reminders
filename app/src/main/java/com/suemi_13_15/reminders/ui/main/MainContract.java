package com.suemi_13_15.reminders.ui.main;

import java.util.List;

public interface MainContract {

    interface View {
        void showProgress(boolean show);
        void showReminders(List<String> Reminders);

    }

    interface Presenter {
        List<String> loadReminders();

    }
}
