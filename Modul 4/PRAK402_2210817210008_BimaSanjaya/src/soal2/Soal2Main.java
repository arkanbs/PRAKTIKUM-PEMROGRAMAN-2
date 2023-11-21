package soal2;
import java.util.Scanner;
public class Soal2Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Nama hewan peliharaan: ");
                String namaK1 = in.next();
                System.out.print("Ras: ");
                String rasK1 = in.next();
                System.out.print("Warna Bulu: ");
                String warnaK1 = in.next();
                Kucing K1 = new Kucing(namaK1, rasK1, warnaK1);
                K1.display();
                break;
            case 2:
                System.out.print("Nama hewan peliharaan: ");
                String namaA1 = in.next();
                System.out.print("Ras: ");
                String rasA1 = in.next();
                System.out.print("Warna Bulu: ");
                String warnaA1 = in.next();
                System.out.print("Kemampuan: ");
                in.nextLine();
                String[] kemampuan = in.nextLine().split(", ");
                Anjing A1 = new Anjing(namaA1, rasA1, warnaA1, kemampuan);
                A1.display();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}