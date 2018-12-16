package com.kelas_a.pbo.pbo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.kelas_a.pbo.pbo.classes.TampilanMenu;

import java.util.ArrayList;

public class MenuGridAdapter extends RecyclerView.Adapter<MenuGridAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<TampilanMenu> listMenu;

    public MenuGridAdapter(Context context) {
        this.context = context;
    }
    public ArrayList<TampilanMenu> getListMenu() {
        return listMenu;
    }

    public void setListMenu(ArrayList<TampilanMenu> listMenu) {
        this.listMenu = listMenu;
    }


    @NonNull
    @Override
    public MenuGridAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_menu, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuGridAdapter.GridViewHolder gridViewHolder, int position) {

        Glide.with(context)
                .load(getListMenu().get(position).getGambar())
                .apply(new RequestOptions().override(350, 550))
                .into(gridViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListMenu().size();
    }


    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
