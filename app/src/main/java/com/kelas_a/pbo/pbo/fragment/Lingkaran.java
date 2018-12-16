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
import com.kelas_a.pbo.pbo.classes.Circle;
import com.kelas_a.pbo.pbo.classes.Cube;
import com.kelas_a.pbo.pbo.classes.Shape;


public class Lingkaran extends Fragment {

    Circle lingkaran;
    EditText jari;
    TextView tvLuas, tvKeliling;
    Button hitung;
    double r, luas, keliling;


    public Lingkaran() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lingkaran, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        jari = view.findViewById(R.id.input_jariLingkaran);
        tvKeliling = view.findViewById(R.id.KelilingLingkaran);
        tvLuas = view.findViewById(R.id.LuasLingkaran);
        hitung = view.findViewById(R.id.btn_hitungLingkaran);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                r = Double.valueOf(jari.getText().toString());

                lingkaran = new Circle(r);
                luas = lingkaran.getLuas();
                keliling = lingkaran.getKeliling();

                tvKeliling.setText(String.valueOf(keliling));
                tvLuas.setText(String.valueOf(luas));
            }
        });




    }
}
