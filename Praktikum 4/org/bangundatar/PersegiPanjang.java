package org.bangundatar;
import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    // Konstruktor
    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    // Method hitung luas
    public double hitungLuas(){
        return panjang * lebar;
    }

    // Method untuk mencetak informasi
    public void printInfo(){
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}
