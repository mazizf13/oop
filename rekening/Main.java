package rekening;

public class Main {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        tabungan.simpan(2000000000);
        System.out.println("Saldo rekening tabungan Anda saat ini: ");
        tabungan.cetak(); 
        tabungan.ambil(50000000);
        System.out.println("Saldo rekening tabungan Anda setelah diambil: ");
        tabungan.cetak(); 
        
        Deposito deposito = new Deposito();
        deposito.simpan(2000000000);
        System.out.println("Saldo rekening deposito Anda saat ini: ");
        deposito.cetak(); 
        deposito.ambil(50000000); 
        System.out.println("Saldo rekening deposito Anda saat ini: ");
        deposito.cetak();
    }
}
