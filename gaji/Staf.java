package gaji;

class Staf extends Karyawan {
    private Double biayaLembur;

    public Staf(String nama, Double gaji, Double biayaLembur) {
        super(nama, gaji);
        this.biayaLembur = biayaLembur;
    }

    @Override
    public Double hitungGaji() {
        return gaji + biayaLembur;
    }
}
