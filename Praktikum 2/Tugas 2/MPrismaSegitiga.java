/*
 * NAMA: INDANA NAJWA RAMADHANI
 * NIM : 24060122130070
 */

public class MPrismaSegitiga {
    public static void main(String[] args){
        Segitiga s = new Segitiga(3, 4);
        PrismaSegitiga pS = new PrismaSegitiga(s, 5);

        System.out.println("Segitiga(" + s.getAlas() + ", " + s.getTinggiSegitiga() + ")");

        double Volume = pS.hitungVolume();
        System.out.println("Volume: " + Volume);

        double LuasPermukaan = pS.hitungLuasPermukaan();
        System.out.println("Luas Permukaan: " + LuasPermukaan);
    }
}
