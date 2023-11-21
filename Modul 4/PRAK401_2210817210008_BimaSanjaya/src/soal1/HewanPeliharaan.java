package soal1;
import java.util.Scanner;
public class HewanPeliharaan {
    private String Nama, Ras;
    Scanner in = new Scanner(System.in);
    public HewanPeliharaan(String n, String r) {
        this.Nama = n;
        this.Ras = r;
    }
    public void display() {
        System.out.print("Nama Hewan Peliharaan: ");
        Nama = in.nextLine();
        System.out.print("Ras: ");
        Ras = in.nextLine();
        System.out.println("\nDetail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah : " + Nama);
        System.out.println("Dengan ras : " + Ras);
    }
}