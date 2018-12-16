package com.kelas_a.pbo.pbo.classes;

public abstract class Shape {
    private double panjang;
    private double lebar;

    public  Shape(){
        this.panjang = 5;
        this.lebar = 4;
    }

    public Shape(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    abstract double getLuas();
    abstract double getKeliling();

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
}
