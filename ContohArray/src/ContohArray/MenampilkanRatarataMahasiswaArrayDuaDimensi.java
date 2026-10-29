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
public class MenampilkanRatarataMahasiswaArrayDuaDimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahMahasiswa = 3;
        int jumlahMatkul = 4;

        String[] namaMatkul = new String[jumlahMatkul];
        
        System.out.println("=========================================");
        System.out.println("     INPUT NAMA 4 MATA KULIAH");
        System.out.println("=========================================");
        for (int j = 0; j < jumlahMatkul; j++) {
            System.out.print("Masukkan nama Mata Kuliah ke-" + (j + 1) + ": ");
            namaMatkul[j] = input.nextLine();
        }

        String[] daftarMahasiswa = new String[jumlahMahasiswa];
        double[][] nilaiMahasiswa = new double[jumlahMahasiswa][jumlahMatkul];

        System.out.println("\n=========================================");
        System.out.println("     INPUT DATA NILAI MAHASISWA");
        System.out.println("=========================================");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("\nMasukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
            daftarMahasiswa[i] = input.nextLine();

            System.out.println("Masukkan nilai untuk " + daftarMahasiswa[i] + ":");
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print(" - Nilai " + namaMatkul[j] + ": ");
                nilaiMahasiswa[i][j] = input.nextDouble();
            }
            input.nextLine(); 
        }

        System.out.println("\n=========================================");
        System.out.println("      REKAP RATA-RATA NILAI MAHASISWA");
        System.out.println("=========================================");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            double totalNilai = 0;

            System.out.println("Mahasiswa : " + daftarMahasiswa[i]);
            
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.printf("   - %s: %.1f\n", namaMatkul[j], nilaiMahasiswa[i][j]);
                totalNilai += nilaiMahasiswa[i][j];
            }

            double rataRata = totalNilai / jumlahMatkul;

            System.out.printf(" ==> Rata-rata: %.2f\n", rataRata);
            System.out.println("-----------------------------------------");
        }

        input.close();
    }
}