/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan61.bangunruang;

/**
 *
 * 
 */
public class Kerucut extends BangunRuang{
    
    private double tinggi;
    private double jari;

    public double getTinggi() {
        return tinggi;
    }

    public double getJari() {
        return jari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double hitungVolume() {
        return 1 * 3.14 * (jari * jari) * tinggi / 3;
    }
}
