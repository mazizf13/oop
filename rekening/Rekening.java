package rekening;

public abstract class Rekening {
    protected int saldo;

    public void simpan(int jumlah) {
        saldo += jumlah;
    }

    public abstract void ambil(int jumlah);

    public void cetak() {
        System.out.println("Saldo saat ini: " + saldo);
    }
}
