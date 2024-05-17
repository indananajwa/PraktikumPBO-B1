/*
 * File : BangunDatarGeneric.java 05/17/2024
 * Penulis : Indana Najwa Ramadhani
 * NIM : 24060122130070
 * Lab : PBO B1
 */

public class BangunDatarGeneric<T extends BangunDatar> {
//public class BangunDatarGeneric<T1 extends BangunDatar>{
    private T bangunDatar;
    //private T1 bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    } 
    /* public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    } */
    
    public T get(){
        return bangunDatar;
    }
    /* public T1 get(){
        return bangunDatar;
    } */

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

/* Pertanyaan */
/* Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti dengan 
 * karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan! */

/* Pembahasan */
/* Mengubah nama parameter 'T' dengan karakter lain pada BangunDatarGeneric.java
 * tidak akan mengubah fungsi apapun pada kelas dan metode tersebut. Jadi tidak 
 * berpengaruh apa-apa. Nama parameter ini hanya digunakan untuk memahami maksud 
 * dan tujuan dari parameter tersebut. */
