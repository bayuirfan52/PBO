package com.kelas_a.pbo.pbo.classes;

public class Square extends Shape {

    private double panjang;

    public Square(){
        this.panjang = 5;
    }

    public Square(double panjang){
        this.panjang = panjang;
    }

    @Override
    double getLuas() {
        double luas = panjang * panjang;
        return luas;
    }

    @Override
    double getKeliling() {
        return panjang * 4;
    }

    @Override
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    @Override
    public double getPanjang() {
        return panjang;
    }
}
