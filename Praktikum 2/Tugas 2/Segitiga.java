/*
 * NAMA: INDANA NAJWA RAMADHANI
 * NIM : 24060122130070
 */

public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(){
        alas = 0;
        tinggi = 0;
    }
    public Segitiga(double a, double t){
        alas = a;
        tinggi = t;
    }
    public double getAlas(){
        return alas;
    }
    public double getTinggiSegitiga(){
        return tinggi;
    }
    public double hitungLuas(){
        double luas = (alas * tinggi) / 2;
        return luas;
    }
}
