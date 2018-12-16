package com.kelas_a.pbo.pbo.classes;

public class Block extends Shape implements BangunRuang{
    private double panjang;
    private double lebar;

    private double tinggi;

    public Block(){
        this.panjang = 5;
        this.lebar = 4;
        this.tinggi =3;
    }

    public Block (double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double getVolume(){
        return panjang * lebar * tinggi;
    }

    @Override
    double getLuas() {
        double luasPanjang = panjang * lebar;
        double luasLebar = lebar * tinggi;
        double luasTinggi = panjang*tinggi;
        return (luasPanjang + luasLebar + luasTinggi) * 2;
    }

    @Override
    public double getPanjang() {
        return panjang;
    }

    @Override
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    @Override
    public double getLebar() {
        return lebar;
    }

    @Override
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
