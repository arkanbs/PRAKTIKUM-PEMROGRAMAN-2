import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PRAK101_2210817210008_BimaSanjaya {
    public static void main(String[] args) throws IOException {
        String nama, tempat_lahir;
        int tanggal_lahir, bulan_lahir, tahun_lahir, tinggi_badan;
        double berat_badan;
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Masukkan Nama Lengkap: ");
        nama = br.readLine();
        System.out.print("Masukkan Tempat Lahir: ");
        tempat_lahir = br.readLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        tanggal_lahir = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Bulan Lahir: ");
        bulan_lahir = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Tahun Lahir: ");
        tahun_lahir = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Tinggi Badan: ");
        tinggi_badan = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Berat Badan: ");
        berat_badan = Double.parseDouble(br.readLine());
        String namaBulanLahir = (bulan_lahir >= 1 && bulan_lahir <= 12) ? namaBulan[bulan_lahir - 1] : "Bulan Tidak Valid";
        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempat_lahir + " pada Tanggal " + tanggal_lahir + " " + namaBulanLahir + " " + tahun_lahir);
        System.out.println( "Tinggi Badan " + tinggi_badan + " cm dan berat badan " + berat_badan + " kilogram");
    }
}