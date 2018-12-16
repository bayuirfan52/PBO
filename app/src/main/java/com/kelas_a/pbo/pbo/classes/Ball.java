package com.kelas_a.pbo.pbo.classes;

public class Ball extends Shape {
    private double jariJari;
    private double pi = 3.14;

    public Ball(){
        this.jariJari = 7;
    }
    public Ball(double jariJari){
        this.jariJari = jariJari;
    }

    public double getVolume(){
        return 4/3 * pi * Math.pow(jariJari, 3);
    }

    @Override
    double getLuas() {
        return 4 * pi * Math.pow(jariJari, 2);
    }

    @Override
    double getKeliling() {
        return 0;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
}
