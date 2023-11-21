package soal2;
abstract class HewanPeliharaan {
    private String Nama, Ras;
    public HewanPeliharaan(String n, String r) {
        this.Nama = n;
        this.Ras = r;
    }
    public void display() {
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + Nama);
        System.out.println("Dengan ras : " + Ras);
    }
}