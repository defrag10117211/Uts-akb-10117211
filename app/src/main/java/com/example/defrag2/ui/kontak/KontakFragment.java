package com.example.defrag2.ui.kontak;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;

import androidx.lifecycle.ViewModelProviders;

import com.example.defrag2.R;
//menampilkan fragment kontak 10117211,defrag,if-7
public class KontakFragment extends Fragment {

    private KontakViewModel kontakViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        kontakViewModel =
                ViewModelProviders.of(this).get(KontakViewModel.class);
        View root = inflater.inflate(R.layout.fragment_kontak, container, false);
        final TextView textView = root.findViewById(R.id.text_kontak);
        kontakViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}