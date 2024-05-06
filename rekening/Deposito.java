package rekening;

public class Deposito extends Rekening {
    @Override
    public void ambil(int jumlah) {
        System.out.println("Penarikan dana tidak diizinkan untuk Deposito");
    }
}
