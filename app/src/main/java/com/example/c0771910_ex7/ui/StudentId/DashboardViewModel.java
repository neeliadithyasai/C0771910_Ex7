package com.example.c0771910_ex7.ui.StudentId;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Adithya Sai Neeli\n course: MADT");
    }

    public LiveData<String> getText() {
        return mText;
    }
}