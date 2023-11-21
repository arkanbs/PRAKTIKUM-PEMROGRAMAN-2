package soal2;
class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] Kemampuan;
    public Anjing(String n, String r, String wb, String[] k) {
        super(n, r);
        this.warnaBulu = wb;
        this.Kemampuan = k;
    }
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.print("Memiliki Kemampuan : " );
        for (String input : Kemampuan){
            System.out.print(input + " ");
        }
    }
}