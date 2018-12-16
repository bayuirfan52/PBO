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
import com.kelas_a.pbo.pbo.classes.Rectangle;
import com.kelas_a.pbo.pbo.classes.Shape;
import com.kelas_a.pbo.pbo.classes.Triangle;


public class Segitiga extends Fragment {
    Triangle segitiga;
    EditText alas, tinggi;
    TextView tvKeliling, tvLuas;
    Button hitung;
    double a, t, luas, keliling;


    public Segitiga() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_segitiga, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        alas = view.findViewById(R.id.input_alasSegitiga);
        tinggi = view.findViewById(R.id.input_tinggiSegitiga);
        tvKeliling = view.findViewById(R.id.KelilingSegitiga);
        tvLuas = view.findViewById(R.id.LuasSegitiga);
        hitung = view.findViewById(R.id.btn_hitungSegitiga);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Double.valueOf(alas.getText().toString());
                t = Double.valueOf(tinggi.getText().toString());

                segitiga = new Triangle(a, t);
                luas = segitiga.getLuas();
                keliling = segitiga.getKeliling();

                tvKeliling.setText(String.valueOf(keliling));
                tvLuas.setText(String.valueOf(luas));
            }
        });
    }
}
