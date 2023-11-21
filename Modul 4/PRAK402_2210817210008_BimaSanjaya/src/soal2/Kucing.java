package soal2;
class Kucing extends HewanPeliharaan {
    private String warnaBulu;
    public Kucing(String n, String r, String wb) {
        super(n, r);
        this.warnaBulu = wb;
    }
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}