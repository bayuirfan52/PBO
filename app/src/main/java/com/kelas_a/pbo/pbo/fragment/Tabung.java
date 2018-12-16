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
import com.kelas_a.pbo.pbo.classes.Cube;
import com.kelas_a.pbo.pbo.classes.Shape;
import com.kelas_a.pbo.pbo.classes.Tube;

public class Tabung extends Fragment {
    Tube tabung;

    EditText jari, tinggi;
    TextView tvVolume, tvLuas;
    Button hitung;
    double r, t, luas, volume;


    public Tabung() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tabung, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        jari = view.findViewById(R.id.input_jariTabung);
        tinggi = view.findViewById(R.id.input_tinggiTabung);
        tvVolume = view.findViewById(R.id.VolumeTabung);
        tvLuas = view.findViewById(R.id.LuasTabung);
        hitung = view.findViewById(R.id.btn_hitungTabung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r = Double.valueOf(jari.getText().toString());
                t = Double.valueOf(tinggi.getText().toString());

                tabung = new Tube(r, t);
                luas = tabung.getLuas();
                volume = tabung.getVolume();

                tvVolume.setText(String.valueOf(volume));
                tvLuas.setText(String.valueOf(luas));
            }
        });

    }

}
