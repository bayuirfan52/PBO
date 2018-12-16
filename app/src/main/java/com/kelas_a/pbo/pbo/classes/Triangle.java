package com.kelas_a.pbo.pbo.classes;

public class Triangle extends Shape implements BangunDatar{
    private double alas;
    private double tinggi;

    public Triangle(){
        this.alas = 4;
        this.tinggi = 3;
    }

    public Triangle(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    double getSisiMiring( double alas, double tinggi){
        double sisiMiring;
        return sisiMiring = Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2)) ;
    }

    @Override
    double getLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double getKeliling() {
        return getSisiMiring(alas,tinggi) * 2 + alas;
    }
}
