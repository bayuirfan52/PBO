package com.kelas_a.pbo.pbo.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.kelas_a.pbo.pbo.ItemClickSupport;
import com.kelas_a.pbo.pbo.MenuGridAdapter;
import com.kelas_a.pbo.pbo.R;
import com.kelas_a.pbo.pbo.activity.PerhitunganActivity;
import com.kelas_a.pbo.pbo.classes.MenuData;
import com.kelas_a.pbo.pbo.classes.TampilanMenu;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TigaDimensiFragment extends Fragment {
    private RecyclerView rvMenu;
    private ArrayList<TampilanMenu> list = new ArrayList<>();
    MenuGridAdapter mAdapter;


    public TigaDimensiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tiga_dimensi, container, false);
        rvMenu = v.findViewById(R.id.rv_menu3D);
        //rvCategory.setHasFixedSize(true);

        list.addAll(MenuData.getMenu3D());
        //RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        rvMenu.setLayoutManager(new GridLayoutManager(getActivity(),2));
        rvMenu.setItemAnimator(new DefaultItemAnimator());
        rvMenu.addItemDecoration(new DividerItemDecoration(getActivity(),
                DividerItemDecoration.VERTICAL));
        mAdapter=new MenuGridAdapter(getActivity());

        mAdapter.setListMenu(list);
        rvMenu.setAdapter(mAdapter);


        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ItemClickSupport.addTo(rvMenu).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedItem(list.get(position));
            }
        });
    }

    private void showSelectedItem(TampilanMenu tampilanMenu) {
        Intent intent = new Intent(getContext(),PerhitunganActivity.class);
        intent.putExtra("id", tampilanMenu.getId());
        getContext().startActivity(intent);
    }


}