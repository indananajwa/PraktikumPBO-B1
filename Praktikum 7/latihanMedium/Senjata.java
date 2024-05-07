/*
 * File : Senjata.java 05/07/2024
 * Penulis : Indana Najwa Ramadhani
 * NIM : 24060122130070
 * Lab : PBO B1
 */

public class Senjata {
    private String bunyi;
    private int Peluru;
    private boolean menusuk;

    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    public String getBunyi(){
        return bunyi;
    }
    public int getPeluru(){
        return Peluru;
    }
    public boolean isMenusuk(){
        return menusuk;
    }
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    public void setPeluru(int Peluru){
        this.Peluru = Peluru;
    }
    public void setMenusuk(boolean menusuk){
        this.menusuk = true;
    }
}
