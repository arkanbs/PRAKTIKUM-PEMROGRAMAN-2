public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        //pada baris ini terjadi error karena kurangnya titik koma (;)
        //p1.nama = "Roi"
        p1.nama = "Roi"; //kita tambahkan titik koma (;) di belakangnya
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //pada baris ini seharusnya kita buat properti untuk variabel umur
        p1.umur = 17;

        //print output kita ubah menjadi Nama
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //print output untuk umur sebelumnya mengeluarkan nilai 0 karena belum memiliki properti
        //selanjutnya kita tambahkan kata tahun setelah memanggil variabel umur
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}