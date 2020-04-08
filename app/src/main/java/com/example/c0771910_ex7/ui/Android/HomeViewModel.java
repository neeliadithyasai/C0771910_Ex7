package com.example.c0771910_ex7.ui.Android;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(" Android is a mobile operating system developed by Google. It is used by several smartphones and tablets. ... The Android operating system (OS) is based on the Linux kernel. Unlike Apple's iOS, Android is open source, meaning developers can modify and customize the OS for each phone.\nInitial release date: September 23, 2008\n" +
                "Platforms: 32- and 64-bit ARM, x86 and x86-64\n" +
                "Package manager: APK-based\n" +
                "License: Apache License 2.0; GNU GPL v2 for the Linux kernel modifications;\n" +
                "Developer: Various (mostly Google and the Open Handset Alliance)\n" +
                "Written in: Java, C, C++, XML, Assembly language, Python, Shell script, Go, Make, D");
    }

    public LiveData<String> getText() {
        return mText;
    }
}