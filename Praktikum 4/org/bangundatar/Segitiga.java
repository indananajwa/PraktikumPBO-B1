package org.bangundatar;
import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    // Konstruktor
    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    // Method hitung luas
    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }

    // Method untuk mencetak informasi
    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
    }
    
}
