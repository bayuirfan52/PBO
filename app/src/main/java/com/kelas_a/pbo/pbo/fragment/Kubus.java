package com.kelas_a.pbo.pbo.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.kelas_a.pbo.pbo.R;
import com.kelas_a.pbo.pbo.classes.Block;
import com.kelas_a.pbo.pbo.classes.Cube;
import com.kelas_a.pbo.pbo.classes.Shape;
import com.kelas_a.pbo.pbo.classes.Square;

public class Kubus extends Fragment {
    Cube kubus;
    EditText sisi;
    TextView tvVolume, tvLuas;
    Button hitung;
    double s, luas, volume;

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

        sisi = view.findViewById(R.id.input_sisiKubus);
        tvVolume = view.findViewById(R.id.VolumeKubus);
        tvLuas = view.findViewById(R.id.LuasKubus);
        hitung = view.findViewById(R.id.btn_hitungKubus);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = Double.valueOf(sisi.getText().toString());

                kubus = new Cube(s);
                luas = kubus.getLuas();
                volume = kubus.getVolume();

                tvVolume.setText(String.valueOf(volume));
                tvLuas.setText(String.valueOf(luas));
            }
        });

    }

}
