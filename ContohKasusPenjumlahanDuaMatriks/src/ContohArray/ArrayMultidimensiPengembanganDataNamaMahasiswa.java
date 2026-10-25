/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContohArray;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class ArrayMultidimensiPengembanganDataNamaMahasiswa {
    public static String[] inputNamaProdi(Scanner scanner, int jumlahProdi) {
        String[] namaProdi = new String[jumlahProdi];
        System.out.println("\n--- MASUKKAN NAMA PROGRAM STUDI ---");
        for (int i = 0; i < jumlahProdi; i++) {
            System.out.print("Nama Program Studi ke-" + (i + 1) + " : ");
            namaProdi[i] = scanner.nextLine();
        }
        return namaProdi;
    }

    // 2. Method untuk menginput data nama mahasiswa ke dalam Array 3D secara dinamis
    public static String[][][] inputDataMahasiswa(Scanner scanner, String[] namaProdi) {
        int jumlahProdi = namaProdi.length;
        
        System.out.println("\n=== INPUT UKURAN KELAS & MAHASISWA ===");
        System.out.print("Masukkan jumlah Kelas per Prodi (Dimensi 2)     : ");
        int jumlahKelas = scanner.nextInt();
        
        System.out.print("Masukkan jumlah Mahasiswa per Kelas (Dimensi 3) : ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer enter

        // Deklarasi Array 3D: [Prodi][Kelas][Mahasiswa]
        String[][][] data = new String[jumlahProdi][jumlahKelas][jumlahMahasiswa];

        System.out.println("\n=== MASUKKAN DATA NAMA MAHASISWA ===");
        for (int i = 0; i < jumlahProdi; i++) {
            System.out.println("\n[ Program Studi: " + namaProdi[i] + " ]");
            for (int j = 0; j < jumlahKelas; j++) {
                System.out.println("  --- Kelas ke-" + (j + 1) + " ---");
                for (int k = 0; k < jumlahMahasiswa; k++) {
                    System.out.print("    Nama Mahasiswa [" + (i + 1) + "][" + (j + 1) + "][" + (k + 1) + "] : ");
                    data[i][j][k] = scanner.nextLine();
                }
            }
        }
        return data;
    }

    // 3. Method untuk menampilkan daftar data mahasiswa secara terstruktur
    public static void tampilkanData(String[][][] data, String[] namaProdi) {
        System.out.println("\n========================================");
        System.out.println("      DAFTAR LENGKAP DATA MAHASISWA ");
        System.out.println("========================================");
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("\n[ Program Studi: " + namaProdi[i] + " ]");
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("    -- Kelas " + (j + 1) + " :");
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.println("        > Mahasiswa " + (k + 1) + " : " + data[i][j][k]);
                }
            }
        }
    }

    // 4. Method untuk melakukan manipulasi dan analisis Operasi String
    public static void prosesOperasiString(String[][][] data, String[] namaProdi) {
        System.out.println("\n========================================");
        System.out.println("      ANALISIS & OPERASI STRING");
        System.out.println("========================================");

        for (int i = 0; i < data.length; i++) {
            System.out.println("\n[ Program Studi: " + namaProdi[i] + " ]");
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("    -- Kelas " + (j + 1) + " :");
                for (int k = 0; k < data[i][j].length; k++) {
                    String namaAsli = data[i][j][k];
                    
                    // Penerapan Operasi String Java:
                    // 1. toUpperCase() -> Mengubah teks menjadi huruf kapital semua
                    // 2. length() -> Menghitung total karakter nama
                    // 3. substring() -> Mengambil 3 huruf pertama sebagai inisial
                    String namaKapital = namaAsli.toUpperCase();
                    int jumlahKarakter = namaAsli.length();
                    String inisial = namaAsli.length() >= 3 ? 
                                     namaAsli.substring(0, 3).toUpperCase() : 
                                     namaAsli.toUpperCase();

                    System.out.println("        * Nama Asli  : " + namaAsli + 
                                       " | Kapital: " + namaKapital + 
                                       " | Karakter: " + jumlahKarakter + 
                                       " | Inisial: " + inisial);
                }
            }
        }
    }

    // 5. Method Utama (Main Method)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PROGRAM PENDATAAN MAHASISWA 3D ===");
        System.out.print("Masukkan jumlah Program Studi (Dimensi 1): ");
        int jumlahProdi = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        // Memanggil method input nama prodi
        String[] namaProdi = inputNamaProdi(scanner, jumlahProdi);

        // Memanggil method input data mahasiswa ke array 3D
        String[][][] dataMhs = inputDataMahasiswa(scanner, namaProdi);

        // Memanggil method tampilkan data
        tampilkanData(dataMhs, namaProdi);

        // Memanggil method operasi string
        prosesOperasiString(dataMhs, namaProdi);

        scanner.close();
    }
}
