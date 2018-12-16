package com.kelas_a.pbo.pbo.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kelas_a.pbo.pbo.R;
import com.kelas_a.pbo.pbo.classes.Cube;
import com.kelas_a.pbo.pbo.classes.Shape;
import com.kelas_a.pbo.pbo.classes.Square;

public class Kubus extends Fragment {
    Shape kubus;


    public Kubus() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kubus, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        kubus = new Cube();

    }

}
