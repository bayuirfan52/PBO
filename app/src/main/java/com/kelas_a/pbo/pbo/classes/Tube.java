package com.kelas_a.pbo.pbo.classes;

public class Tube extends Shape implements BangunRuang{
    private double jariJari;
    private double pi = 3.14;

    private double tinggi;

    public Tube(){
        this.jariJari = 7;
        this.tinggi = 10;
    }

    public Tube(double jariJari, double tinggi){
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double getVolume(){
        return getLuasAlas() * tinggi;
    }

    double getLuasAlas(){
        return pi * Math.pow(jariJari, 2);
    }

    @Override
    double getLuas() {
        double luasSelimut = pi * jariJari * 2 * tinggi;
        return getLuasAlas() * 2 + luasSelimut;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
