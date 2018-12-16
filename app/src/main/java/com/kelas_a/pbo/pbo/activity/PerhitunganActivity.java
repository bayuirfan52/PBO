package com.kelas_a.pbo.pbo.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.kelas_a.pbo.pbo.R;
import com.kelas_a.pbo.pbo.fragment.Balok;
import com.kelas_a.pbo.pbo.fragment.Bola;
import com.kelas_a.pbo.pbo.fragment.Kubus;
import com.kelas_a.pbo.pbo.fragment.Lingkaran;
import com.kelas_a.pbo.pbo.fragment.Persegi;
import com.kelas_a.pbo.pbo.fragment.PersegiPanjang;
import com.kelas_a.pbo.pbo.fragment.Segitiga;
import com.kelas_a.pbo.pbo.fragment.Tabung;

public class PerhitunganActivity extends AppCompatActivity {

    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perhitungan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        int id = bundle.getInt("id");

        setFragment(id, savedInstanceState);
    }

    public void setFragment(int id, Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            switch (id) {
                case 1:
                    fragment = new Persegi();
                    break;
                case 2:
                    fragment = new PersegiPanjang();
                    break;
                case 3:
                    fragment = new Segitiga();
                    break;
                case 4:
                    fragment = new Lingkaran();
                    break;
                case 5:
                    fragment = new Kubus();
                    break;
                case 6:
                    fragment = new Balok();
                    break;
                case 7:
                    fragment = new Tabung();
                    break;
                case 8:
                    fragment = new Bola();
                    break;
            }
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_perhitungan, fragment)
                    .commit();
        }
    }
}
