/*
 * File : Data.java 05/17/2024
 * Penulis : Indana Najwa Ramadhani
 * NIM : 24060122130070
 * Lab : PBO B1
 */

public class Data <T extends Kupu> {
    private T isi;

    public T getIsi(){
        return this.isi;
    }
    public void setIsi(T x){
        this.isi = x;
    }
}