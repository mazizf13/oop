package gaji;

import java.util.ArrayList;
import java.util.List;

class Perusahaan {
    private List<Karyawan> karyawan;
    public Perusahaan(String nama) {
        this.karyawan = new ArrayList<>();
    }

    public void tambahKaryawan(Karyawan karyawan) {
        this.karyawan.add(karyawan);
    }

    public void distribusiGajiBulanan() {
        System.out.println("Distribusi Gaji Bulanan :");
        for (Karyawan karyawan : karyawan) {
            System.out.println("Nama: " + karyawan.getNama() + ", Gaji: " + karyawan.hitungGaji());
        }
    }
}
