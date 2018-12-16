package com.kelas_a.pbo.pbo.classes;

public class Cube extends Shape implements BangunRuang{
    private double panjang;

    public Cube(){
        this.panjang = 5;
    }

    public Cube (double panjang){
        this.panjang = panjang;
    }

    @Override
    public double getVolume(){
        return Math.pow(panjang,3);
    }

    @Override
    double getLuas() {
        return Math.pow(panjang, 2)*6;
    }

    @Override
    public double getPanjang() {
        return panjang;
    }

    @Override
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
}
