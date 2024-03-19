import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args){
        // Objek kelas Scanner
        // Menerima input pengguna
        Scanner scan = new Scanner(System.in);
        
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar: ");

        // Mengambil nilai pengguna
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}

/* Pertanyaan:
 * Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi
 * metode abstrak yang ada pada kelas BangunDatar ? jelaskan ! 
 * 
 * Jawaban:
 * Akan terjadi Error. Hal ini disebabkan karena kelas tidak adanya inherintance
 * atau subclass terhadap superclass (BangunDatar.java). Dengan kata lain, 
 * implementasi metode abstrak yang dibuat oleh kelas BangunDatar perlu
 * memanggil metode abstrak dan sebuah inheritance/subclass. 
 */
