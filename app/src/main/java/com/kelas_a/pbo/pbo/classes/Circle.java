package com.kelas_a.pbo.pbo.classes;

public class Circle extends Shape implements BangunDatar{
    private double jariJari;
    private double pi = 3.14;

    public Circle(){
        this.jariJari = 7;
    }

    public Circle(double jariJari){
        this.jariJari = jariJari;
    }

    @Override
    double getLuas() {
        return pi * Math.pow(jariJari, 2);
    }

    @Override
    public double getKeliling() {
        return pi * (jariJari * 2);
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
}