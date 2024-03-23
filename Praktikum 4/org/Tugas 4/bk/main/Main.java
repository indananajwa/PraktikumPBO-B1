package bk.main;
import bk.buku.*;
import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;

public class Main {
    public static void main (String[] args){
        // Buku Fiksi
        bukuNovel Novel1 = new bukuNovel("Historical Fiction", 388, 100.00, "Salt to the Sea", "Ruta Sepetys", "2016");
        Novel1.view();

        // Buku Non Fiksi
        bukuAkademik Akademik1 = new bukuAkademik("Pemrograman Berorientasi Objek", 400, 95.00, "Object-Oriented Programming Concepts", "John Smith", "2022");
        Akademik1.view();

        System.out.println("=======================================");
    }
}
