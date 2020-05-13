package com.example.defrag2.ui.teman;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.defrag2.R;
//menampilkkan fragment teman 10117211,defrag,if-7
public class TemanFragment extends Fragment {

    private TemanViewModel temanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        temanViewModel =
                ViewModelProviders.of(this).get(TemanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_teman, container, false);
        final TextView textView = root.findViewById(R.id.text_teman);
        temanViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

