/*
 * File : MapTest.java 05/17/2024
 * Penulis : Indana Najwa Ramadhani
 * NIM : 24060122130070
 * Lab : PBO B1
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        // Kunci-> Integer, Nilai-> String
        Map<Integer, String> map = new HashMap<Integer, String>();

        // Menempatkan elemen kunci dan nilai
        map.put(1, "Satu");
        map.put(2, "Dua");

        // Mengambil elemen pertama
        System.out.println(map.get(1));
        // Mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();
    }
}

/* Pertanyaan */
/* 1. Bagaimana iterasi untuk mengambil keseluruhan
 * 2. Nilai dari kunci? tulis pada laporan anda!
 * petunjuk: gunakan iterasi seperti program ArrayListTest */

/* Pembahasan */
/*  public class MapTest{
        public static void main (String[] args){
            // Inisialisasi HashMap dengan tipe Integer untuk kunci dan String untuk nilai
            Map <Integer, String> map = new HashMap <Integer, String> ();

            // Menempatkan elemen kunci dan nilai
            map.put(1, "Satu");
            map.put(2, "Dua");
            
            // Mengambil elemen pertama
            System.out.println(map.get(1));
            // mengambil keseluruhan kunci
            Set <Integer> keys = map.keySet();

            //iterasi pada keseluruhan HashMap
            for(Integer key: keys){
                System.out.println("Kunci: " + key + ", Nilai: " + map.get(key));
            }
        }
    }
 
 * 1. Iterasi mengambil keseluruhan kunci dengan menggunakan metode 'keySet()',
 *    Metode ini dipanggil untuk mengakses sebuah 'Set' yang berisi semua
 *    kunci dalam map.
 * 2. Nilai dari kunci:
 *    Kunci: 1, Nilai: Satu
      Kunci: 2, Nilai: Dua */
