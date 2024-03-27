//  Nama     : Mukhamad Aziz Firmansyah
//  NPM      : 22081010030
//  Kelas    : PBO E

package no3;

public class Pegawai {
    private String golongan;
    private double gajiPokok;
    private double tunjangan;
    private double thr;
    private double gajiKe13;
    private double bonus;

    public Pegawai(String golongan, String pegawai_Kontrak) {
        this.golongan = golongan;
        initializeGaji();
    }

    private void initializeGaji() {
        switch (golongan) {
            case "Pegawai Kontrak":
                gajiPokok = 3700000;
                tunjangan = 0.1 * gajiPokok;
                thr = gajiPokok;
                gajiKe13 = gajiPokok;
                bonus = gajiPokok;
                break;
            case "Pegawai Tetap":
                gajiPokok = 3700000;
                tunjangan = 0.1 * gajiPokok;
                thr = 1.3 * gajiPokok;
                gajiKe13 = gajiPokok;
                bonus = 1.3 * gajiPokok;
                break;
            case "Supervisor":
                gajiPokok = 5300000;
                tunjangan = 0.2 * gajiPokok;
                thr = 1.3 * gajiPokok;
                gajiKe13 = gajiPokok;
                bonus = 2 * gajiPokok;
                break;
            case "Manajer":
                gajiPokok = 7500000;
                tunjangan = 0.2 * gajiPokok;
                thr = 1.3 * gajiPokok;
                gajiKe13 = gajiPokok;
                bonus = 5 * gajiPokok;
                break;
            case "Eksekutif":
                gajiPokok = 18000000;
                tunjangan = 0.2 * gajiPokok;
                thr = 1.3 * gajiPokok;
                gajiKe13 = gajiPokok;
                bonus = 14.1 * gajiPokok;
                break;
            default:
                System.out.println("Golongan pegawai tidak valid.");
        }
    }

    public double hitungTotalPendapatan() {
        return 12 * (gajiPokok + tunjangan) + thr + gajiKe13 + (bonus / 2);
    }

    public double hitungPajak() {
        double totalPendapatan = hitungTotalPendapatan();
        if ((totalPendapatan / 12) > 5000000) {
            return 0.06 * totalPendapatan;
        } else {
            return 0;
        }
    }

    public double hitungPendapatanSetelahPajak() {
        return hitungTotalPendapatan() - hitungPajak();
    }
}
