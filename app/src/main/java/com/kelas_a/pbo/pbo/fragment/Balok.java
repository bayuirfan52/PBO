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

public class Balok extends Fragment {
    Block balok;
    EditText panjang, lebar, tinggi;
    TextView tvVolume, tvLuas;
    Button hitung;
    double p, l, t, luas, volume;

    public Balok() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_balok, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        panjang = view.findViewById(R.id.input_panjangBalok);
        lebar = view.findViewById(R.id.input_lebarBalok);
        tinggi = view.findViewById(R.id.input_tinggiBalok);
        tvVolume = view.findViewById(R.id.VolumeBalok);
        tvLuas = view.findViewById(R.id.LuasBalok);
        hitung = view.findViewById(R.id.btn_hitungBalok);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p = Double.valueOf(panjang.getText().toString());
                l = Double.valueOf(lebar.getText().toString());
                t = Double.valueOf(tinggi.getText().toString());

                balok = new Block(p, l, t);
                luas = balok.getLuas();
                volume = balok.getVolume();

                tvVolume.setText(String.valueOf(volume));
                tvLuas.setText(String.valueOf(luas));
            }
        });
    }

}
