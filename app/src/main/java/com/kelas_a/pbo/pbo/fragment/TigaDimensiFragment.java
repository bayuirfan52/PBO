package com.kelas_a.pbo.pbo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kelas_a.pbo.pbo.MenuGridAdapter;
import com.kelas_a.pbo.pbo.R;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
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

}