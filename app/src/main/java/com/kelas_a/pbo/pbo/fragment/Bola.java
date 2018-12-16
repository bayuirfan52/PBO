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
import com.kelas_a.pbo.pbo.classes.Ball;

public class Bola extends Fragment {
    Ball bola;
    EditText jariJari;
    Button hitung;
    TextView volume, luas;
    double jari, vol, luasBola;

    public Bola() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bola, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        jariJari = view.findViewById(R.id.input_jariBola);
        hitung = view.findViewById(R.id.btn_hitungBola);
        volume = view.findViewById(R.id.VolumeBola);
        luas = view.findViewById(R.id.LuasBola);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jari = Double.valueOf(jariJari.getText().toString());

                bola = new Ball(jari);

                vol = bola.getVolume();
                luasBola = bola.getLuas();

                volume.setText(String.valueOf(vol));
                luas.setText(String.valueOf(luasBola));
            }
        });
    }

}
