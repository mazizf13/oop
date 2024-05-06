package gaji;

abstract class Karyawan {
    protected String nama;
    protected Double gaji;

    public Karyawan(String nama, Double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public abstract Double hitungGaji();
}
