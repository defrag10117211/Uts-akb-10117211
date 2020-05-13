package com.example.defrag2.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
// menampilkan view model 10117211,defrag,if-7
public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("PROFIL MAHASISWA");
    }

    public LiveData<String> getText() {
        return mText;
    }
}