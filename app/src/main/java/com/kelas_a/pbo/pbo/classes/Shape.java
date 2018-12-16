package com.kelas_a.pbo.pbo.classes;

public abstract class Shape {
    private double panjang;
    private double lebar;

    public  Shape(){}

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
}
