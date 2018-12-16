package com.kelas_a.pbo.pbo.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.kelas_a.pbo.pbo.R;
import com.kelas_a.pbo.pbo.fragment.DuaDimensiFragment;
import com.kelas_a.pbo.pbo.fragment.TigaDimensiFragment;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.duaDimensi :
                        setFragment(new DuaDimensiFragment(),savedInstanceState);
                        break;
                    case R.id.tigaDimensi :
                        setFragment(new TigaDimensiFragment(),savedInstanceState);
                        break;
                    default:
                        setFragment(new DuaDimensiFragment(), savedInstanceState);
                        break;
                }
                return true;
            }
        });
    }

    private void setFragment(Fragment fragment, Bundle savedInstanceState){
        if (savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_layout,fragment)
                    .commit();
        }
    }
}
