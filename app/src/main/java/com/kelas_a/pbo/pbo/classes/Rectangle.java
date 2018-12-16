package com.kelas_a.pbo.pbo.classes;

public class Rectangle extends Shape {

    private double panjang;
    private double lebar;

    public Rectangle(){
        super();
    }

    public Rectangle(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double getLuas() {
        return panjang * lebar;
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
    double getKeliling() {
        return (panjang + lebar) * 2;
    }


    @Override
    public double getLebar() {
        return lebar;
    }

    @Override
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

}
