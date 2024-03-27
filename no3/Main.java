//  Nama     : Mukhamad Aziz Firmansyah
//  NPM      : 22081010030
//  Kelas    : PBO E

package no3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Masukkan jenis pegawai (Pegawai Kontrak/Pegawai Tetap/Supervisor/Manajer/Eksekutif): ");
            String jenisPegawai = scanner.nextLine();
            
            Pegawai pegawai;
            
            switch (jenisPegawai.toLowerCase()) {
                case "pegawai kontrak" -> pegawai = new Pegawai(jenisPegawai, "Pegawai Kontrak");
                case "pegawai tetap" -> pegawai = new Pegawai(jenisPegawai, "Pegawai Tetap");
                case "supervisor" -> pegawai = new Pegawai(jenisPegawai, "Supervisor");
                case "manajer" -> pegawai = new Pegawai(jenisPegawai, "Manajer");
                case "eksekutif" -> pegawai = new Pegawai(jenisPegawai, "Eksekutif");
                default -> {
                    System.out.println("Jenis pegawai tidak valid!");
                    scanner.close();
                    return;
                }
            }
            
            System.out.println("Informasi Pegawai:");
            System.out.println("Jenis Pegawai: " + jenisPegawai);
            
            System.out.println("Total Pendapatan: Rp " + String.format("%,.2f", pegawai.hitungTotalPendapatan()));
            System.out.println("Pajak: Rp " + String.format("%,.2f", pegawai.hitungPajak()));
            System.out.println("Pendapatan Setelah Pajak: Rp " + String.format("%,.2f", pegawai.hitungPendapatanSetelahPajak()));
        }
    }
}

