/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 */

 public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
 }

 /*
* Pertanyaan 1: Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
* Jawaban: Tidak, karena baris 12 hanya akan mengeksekusi keadaan ketika angka memenuhi 
*          kondisi (tidak sama dengan 13). Namun pada kondisi angka 10 dan 12, sistem akan 
*          dialihkan dan mengeksekusi pesan pada AngkaSialException.
*
* Pertanyaan 2: Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
* Jawaban: Ya. Karena baris ke 19 (cobaAngka(angka:13)) akan masuk ke dalam method cobaAngka, dimana angka 13 memenuhi
           kondisi if, sehingga sistem akan mengeksekusi ke throws new dan menjalankan catch.
*/