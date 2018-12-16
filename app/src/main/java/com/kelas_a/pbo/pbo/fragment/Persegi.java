package com.kelas_a.pbo.pbo.fragment;

import android.content.Context;
import android.net.Uri;
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
import com.kelas_a.pbo.pbo.classes.Circle;
import com.kelas_a.pbo.pbo.classes.Shape;
import com.kelas_a.pbo.pbo.classes.Square;

public class Persegi extends Fragment {
    Square persegi;
    EditText sisi;
    double s,luas,keliling;
    TextView tvLuas,tvKeliling;
    Button hitung;


    public Persegi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_persegi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sisi = view.findViewById(R.id.input_sisiPersegi);
        tvKeliling = view.findViewById(R.id.KelilingPersegi);
        tvLuas = view.findViewById(R.id.LuasPersegi);
        hitung = view.findViewById(R.id.btn_hitungPersegi);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = Double.valueOf(sisi.getText().toString());

                persegi = new Square(s);
                luas = persegi.getLuas();
                keliling = persegi.getKeliling();

                tvKeliling.setText(String.valueOf(keliling));
                tvLuas.setText(String.valueOf(luas));
            }
        });

    }

}
