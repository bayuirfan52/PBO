package com.kelas_a.pbo.pbo.classes;

public class Cube extends Shape {
    private double panjang;

    public Cube(){
        this.panjang = 5;
    }

    public Cube (double panjang){
        this.panjang = panjang;
    }
    double getVolume(){
        return Math.pow(panjang,3);
    }
    @Override
    double getLuas() {
        return Math.pow(panjang, 2)*6;
    }

    @Override
    double getKeliling() {
        return 0;
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
