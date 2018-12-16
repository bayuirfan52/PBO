package com.kelas_a.pbo.pbo.classes;

public class TampilanMenu {
    String nama,gambar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public TampilanMenu(){
        this.nama=getNama();
        this.gambar=getGambar();
        this.id = getId();
    }
    public  TampilanMenu(String nm,String gmb,int id){
        this.nama=nm;
        this.gambar=gmb;
        this.id=id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }


}
