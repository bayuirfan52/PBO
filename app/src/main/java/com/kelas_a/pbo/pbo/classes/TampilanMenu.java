package com.kelas_a.pbo.pbo.classes;

public class TampilanMenu {
    String nama,gambar;

    public TampilanMenu(){
        this.nama=getNama();
        this.gambar=getGambar();
    }
    public  TampilanMenu(String nm,String gmb){
        this.nama=nm;
        this.gambar=gmb;
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
