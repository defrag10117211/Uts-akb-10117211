package com.example.defrag2.ui.teman;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
//view model teman 10117211,defrag,if-7
public class TemanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TemanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
