import java.util.Scanner;
public class PRAK105_2210817210008_BimaSanjaya {
    public static void main(String[] args) {
        final double phi= 3.14;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        float jarijari=scanner.nextFloat();
        System.out.print("Masukkan Tinggi : ");
        float tinggi=scanner.nextFloat();
        double volumeTabung=phi*(jarijari*jarijari)*tinggi;
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3%n", jarijari, tinggi, volumeTabung);
    }
}