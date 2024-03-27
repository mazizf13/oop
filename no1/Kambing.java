//  Nama     : Mukhamad Aziz Firmansyah
//  NPM      : 22081010030
//  Kelas    : PBO E

package no1;

import java.util.Random;

class Kambing {
    private String nama;
    private int stok;
    private double berat;
    private double hargaSatuan;
    private double hargaTotal;

    // Constructor
    public Kambing(String nama) {
        this.nama = nama;
        this.stok = 0;
        this.berat = generateBerat();
        this.hargaSatuan = 0;
        this.hargaTotal = 0;
    }

    // Setter method untuk memasukkan informasi kambing
    public void setKambingInfo(int stok, double hargaSatuan) {
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
        this.hargaTotal = stok * hargaSatuan;
    }

    // Getter method untuk menampilkan informasi kambing
    public void getKambingInfo() {
        System.out.println("Jenis Kambing: " + nama);
        System.out.println("Stok Kambing: " + stok);
        System.out.println("Berat Kambing: " + berat + " kg");
        System.out.println("Harga Satuan: Rp " + hargaSatuan);
        System.out.println("Harga Total: Rp " + hargaTotal);
    }

    // Setter getter method untuk total harga
    public void setTotalHarga(double totalHarga) {
        this.hargaTotal = totalHarga;
    }

    public double getTotalHarga() {
        return hargaTotal;
    }

    // Method untuk menghasilkan berat kambing secara random sesuai dengan jenisnya
    private double generateBerat() {
        Random rand = new Random();
        double minBerat = 0;
        double maxBerat = 0;

        // Menentukan rentang berat sesuai jenis kambing
        if (nama.equalsIgnoreCase("jantan")) {
            minBerat = 19;
            maxBerat = 24;
        } else if (nama.equalsIgnoreCase("betina")) {
            minBerat = 16;
            maxBerat = 22;
        } else if (nama.equalsIgnoreCase("anakan")) {
            minBerat = 2.2;
            maxBerat = 3;
        }

        // Menghasilkan berat random dalam rentang yang ditentukan
        return minBerat + (maxBerat - minBerat) * rand.nextDouble();
    }
}
