package gaji;

class Manajer extends Karyawan {
    private Double tunjangan;

    public Manajer(String nama, Double gaji, Double tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public Double hitungGaji() {
        return gaji + tunjangan;
    }
}
