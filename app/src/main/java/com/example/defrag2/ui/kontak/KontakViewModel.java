package com.example.defrag2.ui.kontak;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
//menampilkan view model kontak 10117211,defrag,if-7
public class KontakViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KontakViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Kontak");
    }

    public LiveData<String> getText() {
        return mText;
    }
}