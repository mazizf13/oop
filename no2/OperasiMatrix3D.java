//  Nama     : Mukhamad Aziz Firmansyah
//  NPM      : 22081010030
//  Kelas    : PBO E

package no2;

import java.util.Scanner;

public class OperasiMatrix3D {
    private final int[][][] matrix1;
    private final int[][][] matrix2;
    private final int depth;
    private final int rows;
    private final int cols;
    
    public OperasiMatrix3D(int depth, int rows, int cols) {
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.matrix1 = new int[depth][rows][cols];
        this.matrix2 = new int[depth][rows][cols];
    }    
    
    // Method untuk mengisi matriks pertama
    public void inputMatrix1() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Masukkan elemen untuk matriks 1:");
            for (int d = 0; d < depth; d++) {
                System.out.println("Depth " + (d + 1) + ":");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrix1[d][i][j] = scanner.nextInt();
                    }
                }
            }
        }
    }
    
        
    // Method untuk mengisi matriks kedua
    public void inputMatrix2() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Masukkan elemen untuk matriks 1:");
            for (int d = 0; d < depth; d++) {
                System.out.println("Depth " + (d + 1) + ":");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrix1[d][i][j] = scanner.nextInt();
                    }
                }
            }
        }
    }
    
        
    // Method untuk menampilkan matriks
    public void displayMatrix(int[][][] matrix) {
        for (int d = 0; d < depth; d++) {
            System.out.println("Depth " + (d + 1) + ":");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[d][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    // Method untuk menghitung determinan matriks
    public int determinan() {
        if (depth != 1 || rows != cols) {
            System.out.println("Determinan hanya bisa dihitung untuk matriks persegi.");
            return 0;
        }
        
        // Karena depth selalu 1 untuk matriks 3 dimensi
        int[][] matrix = matrix1[0];
        
        // Perhitungan determinan menggunakan metode kofaktor
        return calculateDeterminant(matrix);
    }
    
    public int determinanMatrix2() {
        if (depth != 1 || rows != cols) {
            System.out.println("Determinan hanya bisa dihitung untuk matriks persegi.");
            return 0;
        }

        // Karena depth selalu 1 untuk matriks 3 dimensi
        int[][] matrix = matrix2[0];

        // Perhitungan determinan menggunakan metode kofaktor
        return calculateDeterminant(matrix);
    }

    // Method rekursif untuk menghitung determinan matriks
    private int calculateDeterminant(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        
        int determinant = 0;
        for (int i = 0; i < n; i++) {
            determinant += Math.pow(-1, i) * matrix[0][i] * calculateDeterminant(getSubMatrix(matrix, 0, i));
        }
        return determinant;
    }
    
    // Method untuk mendapatkan submatriks dengan menghapus baris dan kolom tertentu
    private int[][] getSubMatrix(int[][] matrix, int rowToRemove, int colToRemove) {
        int n = matrix.length;
        int[][] subMatrix = new int[n - 1][n - 1];
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (i == rowToRemove) {
                continue;
            }
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == colToRemove) {
                    continue;
                }
                subMatrix[r][c++] = matrix[i][j];
            }
            r++;
        }
        return subMatrix;
    }
    
    // Method untuk menjumlahkan dua matriks    
    public int[][][] tambahMatrix() {
        int[][][] result = new int[depth][rows][cols];
        for (int d = 0; d < depth; d++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[d][i][j] = matrix1[d][i][j] + matrix2[d][i][j];
                }
            }
        }
        return result;
    }

    // Method untuk mengurangkan dua matriks
    public int[][][] kurangMatrix() {
        int[][][] result = new int[depth][rows][cols];
        for (int d = 0; d < depth; d++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[d][i][j] = matrix1[d][i][j] - matrix2[d][i][j];
                }
            }
        }
        return result;
    }

    
    // Method untuk mengalikan dua matriks
    public int[][][] kaliMatrix() {
        int[][][] result = new int[depth][rows][cols];
        for (int d = 0; d < depth; d++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    for (int k = 0; k < cols; k++) {
                        result[d][i][j] += matrix1[d][i][k] * matrix2[d][k][j];
                    }
                }
            }
        }
        return result;
    }        
    
    public static void main(String[] args) {
        // Membuat objek OperasiMatrix3D
        OperasiMatrix3D opsMatrix3D = new OperasiMatrix3D(1, 3, 3);
        
        // Memasukkan matriks 1 dan 2
        System.out.println("Masukkan matriks 1:");
        opsMatrix3D.inputMatrix1();
        System.out.println("Masukkan matriks 2:");
        opsMatrix3D.inputMatrix2();
        
        System.out.println("==========================");
        
        // Menampilkan matriks 1 dan 2
        System.out.println("Matriks 1:");
        opsMatrix3D.displayMatrix(opsMatrix3D.matrix1);
        System.out.println("Matriks 2:");
        opsMatrix3D.displayMatrix(opsMatrix3D.matrix2);
        
        System.out.println("==========================");
        
        // Menghitung dan menampilkan determinan matriks 1
        int determinan = opsMatrix3D.determinan();
        System.out.println("Determinan matriks 1 adalah: " + determinan);
        
        // Menghitung dan menampilkan determinan matriks 2
        int determinan2 = opsMatrix3D.determinanMatrix2();
        System.out.println("Determinan matriks 2 adalah: " + determinan2);
        
        System.out.println("==========================");

        // Menampilkan hasil penjumlahan matriks 1 dan 2
        int[][][] tambah = opsMatrix3D.tambahMatrix();
        System.out.println("Hasil penjumlahan matriks 1 dan 2 adalah:");
        opsMatrix3D.displayMatrix(tambah);
        
        System.out.println("==========================");
        
        // Menampilkan hasil pengurangan matriks 1 dan 2
        int[][][] kurang = opsMatrix3D.kurangMatrix();
        System.out.println("Hasil pengurangan matriks 1 dan 2 adalah:");
        opsMatrix3D.displayMatrix(kurang);
        
        System.out.println("==========================");
        
        // Menampilkan hasil perkalian matriks 1 dan 2
        int[][][] kali = opsMatrix3D.kaliMatrix();
        System.out.println("Hasil perkalian matriks 1 dan 2 adalah:");
        opsMatrix3D.displayMatrix(kali);
    }
}