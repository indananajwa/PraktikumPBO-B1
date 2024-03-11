/*
 * NAMA: INDANA NAJWA RAMADHANI
 * NIM : 24060122130070
 */

public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(){
        alas = new Segitiga();
        tinggiPrisma = 0;
    }
    public PrismaSegitiga(Segitiga alasSegitiga, double tp){
        alas = alasSegitiga;
        tinggiPrisma = tp;
    }
    public double hitungVolume(){
        double Volume = alas.hitungLuas() * tinggiPrisma;
        return Volume;
    }
    public double hitungLuasPermukaan(){
        double luasPermukaan = ((2 * alas.hitungLuas()) + (3 * alas.getAlas() * tinggiPrisma));
        return luasPermukaan;
    }
}
