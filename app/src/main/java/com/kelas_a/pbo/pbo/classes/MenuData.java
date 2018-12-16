package com.kelas_a.pbo.pbo.classes;

import java.util.ArrayList;

public class MenuData {
    public static String[][] Bangun2D = new String[][]{
            {"Persegi","https://mamatematika.files.wordpress.com/2016/11/semua-sisi-sama-panjang.png?w=150&h=150"},
            {"Persegi Panjang","https://cdn.pbrd.co/images/3e5rTGi.png"},
            {"Segitiga","https://rumushitung.com/wp-content/uploads/2015/07/segitiga-sama-kaki.png"},
            {"Lingkaran","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhHNNa1FHSPaZzL09TEnCYjBtDkO375EcbtTsWIRHGDS6Taweb"}
    };
    public static String[][] Bangun3D = new String[][]{
            {"Kubus","https://mamatematika.files.wordpress.com/2016/11/semua-sisi-sama-panjang.png?w=150&h=150"},
            {"Balok","https://cdn.pbrd.co/images/3e5rTGi.png"},
            {"Tabung","https://rumushitung.com/wp-content/uploads/2015/07/segitiga-sama-kaki.png"},
            {"Prisma Segitiga","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhHNNa1FHSPaZzL09TEnCYjBtDkO375EcbtTsWIRHGDS6Taweb"}
    };

    public static ArrayList<TampilanMenu> getMenu2D(){
        TampilanMenu tampilanMenu = null;
        ArrayList<TampilanMenu> list2D = new ArrayList<>();
        for (String[] data: Bangun2D) {
            tampilanMenu = new TampilanMenu();
            tampilanMenu.setNama(data[0]);
            tampilanMenu.setGambar(data[1]);

            list2D.add(tampilanMenu);
        }
        return list2D;
    }
    public static ArrayList<TampilanMenu> getMenu3D(){
        TampilanMenu tampilanMenu = null;
        ArrayList<TampilanMenu> list3D = new ArrayList<>();
        for (String[] data: Bangun3D) {
            tampilanMenu = new TampilanMenu();
            tampilanMenu.setNama(data[0]);
            tampilanMenu.setGambar(data[1]);

            list3D.add(tampilanMenu);
        }
        return list3D;
    }
}
