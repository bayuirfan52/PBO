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
            {"Kubus","http://1.bp.blogspot.com/-c-cYA8A6CLI/Vd-l-HgqNfI/AAAAAAAAAhE/OF5GTm8Dpm0/s1600/KUBUS.png"},
            {"Balok","http://rumushitung.com/wp-content/uploads/2013/06/bangun-balok1.png"},
            {"Tabung","https://faririsnorandini.files.wordpress.com/2017/01/56c5a-sifat-sifat-bangun-ruang-tabung.jpg"},
            {"Bola","https://rumushitung.com/wp-content/uploads/2013/06/bangun-ruang-bola.png"}
    };

    public static ArrayList<TampilanMenu> getMenu2D(){
        TampilanMenu tampilanMenu = null;
        ArrayList<TampilanMenu> list2D = new ArrayList<>();
        int id = 0;
        for (String[] data: Bangun2D) {
            id = id+1;
            tampilanMenu = new TampilanMenu();
            tampilanMenu.setNama(data[0]);
            tampilanMenu.setGambar(data[1]);
            tampilanMenu.setId(id);

            list2D.add(tampilanMenu);
        }
        return list2D;
    }
    public static ArrayList<TampilanMenu> getMenu3D(){
        TampilanMenu tampilanMenu = null;
        ArrayList<TampilanMenu> list3D = new ArrayList<>();
        int id = 4;
        for (String[] data: Bangun3D) {
            id = id+1;
            tampilanMenu = new TampilanMenu();
            tampilanMenu.setNama(data[0]);
            tampilanMenu.setGambar(data[1]);
            tampilanMenu.setId(id);

            list3D.add(tampilanMenu);
        }
        return list3D;
    }
}
