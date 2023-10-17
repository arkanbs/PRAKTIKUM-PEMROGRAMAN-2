public class Pegawai {
    public String nama;

    //Pada baris ini terjadi error karena tipe data yang tidak sesuai
    //public char asal;
    public String asal; //tipe data char kita ubah menjadi String
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //pada baris ini terjadi error karena tidak ada tipe data variabel dalam parameter
    //public void setJabatan() {}
    public void setJabatan(String j) { //kita isikan tipe data String disertai variabelnya pada parameter
        this.jabatan = j;
    }
}