package gaji;

public class Main {
    public static void main(String[] args) {
        Staf staf1 = new Staf("Aziz", 3000000.0, 500000.0);
        Staf staf2 = new Staf("Meme", 2500000.0, 3000000.0);
        Manajer manajer1 = new Manajer("Essa", 5000000.0, 1000000.0);
        Manajer manajer2 = new Manajer("Kresna", 6500000.0, 150000.0);

        Perusahaan perusahaan = new Perusahaan("PT AZME");
        perusahaan.tambahKaryawan(staf1);
        perusahaan.tambahKaryawan(staf2);
        perusahaan.tambahKaryawan(manajer1);
        perusahaan.tambahKaryawan(manajer2);

        perusahaan.distribusiGajiBulanan();
    }
}
