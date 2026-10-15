/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subcpmk2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class SistemParkirKampus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan (motor/mobil): ");
        String jenis = scanner.nextLine().toLowerCase();

        System.out.print("Masukkan lama parkir (jam): ");
        int lama = scanner.nextInt();

        int tarifAwal = 0;
        int tarifTambahan = 0;
        String namaKendaraan = "";

        if (jenis.equals("motor")) {
            namaKendaraan = "MOTOR";
            tarifAwal = 2000;
            tarifTambahan = 1000;
        } else if (jenis.equals("mobil")) {
            namaKendaraan = "MOBIL";
            tarifAwal = 5000;
            tarifTambahan = 2000;
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
            scanner.close();
            return;
        }

        int totalBiaya = 0;
        if (lama > 0) {
            totalBiaya = tarifAwal + ((lama - 1) * tarifTambahan);
        }

        System.out.println("\n=== KARCIS PARKIR ===");
        System.out.println("Kendaraan : " + namaKendaraan);
        System.out.println("Lama      : " + lama + " Jam");
        System.out.println("---------------------");
        System.out.println("Total     : Rp " + totalBiaya);
        System.out.println("=====================\n");

        scanner.close();
    }
}