package org.main;
import org.bangundatar.*;

public class MSegitiga {
    public static void main(String[] args){
        Segitiga segitiga =  new Segitiga(5,4, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
    }
}
