//  Nama     : Mukhamad Aziz Firmansyah
//  NPM      : 22081010030
//  Kelas    : PBO E

package no1;

public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk tiap jenis kambing
        Kambing[] kambings = new Kambing[3];
        kambings[0] = new Kambing("jantan");
        kambings[1] = new Kambing("betina");
        kambings[2] = new Kambing("anakan");

        // Memasukkan informasi kambing menggunakan setter method
        kambings[0].setKambingInfo(5, 500000);
        kambings[1].setKambingInfo(6, 400000);
        kambings[2].setKambingInfo(10, 300000);

        // Menampilkan informasi kambing menggunakan getter method
        for (Kambing kambing : kambings) {
            kambing.getKambingInfo();
            System.out.println();
        }

        // Menghitung total harga
        double totalHarga = 0;
        for (Kambing kambing : kambings) {
            totalHarga += kambing.getTotalHarga();
        }

        // Menampilkan total harga
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}