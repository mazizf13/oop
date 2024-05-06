package rekening;

public class Tabungan extends Rekening {
    @Override
    public void ambil(int jumlah) {
        if (saldo - jumlah >= 0) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
    }
}
