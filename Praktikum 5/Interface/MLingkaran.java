import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        System.out.println("Masukkan jejari lingkaran: ");
        Scanner scan = new Scanner(System.in);
        double jejari = scan.nextDouble();

        Lingkaran l = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan " + "jejari " + jejari + " satuan adalah " + l.hitungLuas());
    }
}
