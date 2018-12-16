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
import com.kelas_a.pbo.pbo.classes.Circle;
import com.kelas_a.pbo.pbo.classes.Rectangle;
import com.kelas_a.pbo.pbo.classes.Shape;

public class PersegiPanjang extends Fragment {
    Rectangle persegiPanjang;
    EditText panjang, lebar;
    TextView tvKeliling, tvLuas;
    Button hitung;
    double p, l, luas, keliling;


    public PersegiPanjang() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_persegipanjang, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        panjang = view.findViewById(R.id.input_panjangPersegiPjg);
        lebar = view.findViewById(R.id.input_lebarPersegiPjg);
        tvKeliling = view.findViewById(R.id.KelilingPersegiPjg);
        tvLuas = view.findViewById(R.id.LuasPersegiPjg);
        hitung = view.findViewById(R.id.btn_hitungPersegiPjg);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p = Double.valueOf(panjang.getText().toString());
                l = Double.valueOf(lebar.getText().toString());

                persegiPanjang = new Rectangle(p, l);
                luas = persegiPanjang.getLuas();
                keliling = persegiPanjang.getKeliling();

                tvKeliling.setText(String.valueOf(keliling));
                tvLuas.setText(String.valueOf(luas));
            }
        });

    }

}
