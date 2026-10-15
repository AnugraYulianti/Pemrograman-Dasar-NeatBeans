/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subcpmk3;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class PerhitunganSederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.println("Pilih Operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil = 0;
        boolean valid = true;

        System.out.println("\n--- HASIL ---");
        if (pilihan == 1) {
            hasil = angka1 + angka2;
            System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil);
        } else if (pilihan == 2) {
            hasil = angka1 - angka2;
            System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + hasil);
        } else if (pilihan == 3) {
            hasil = angka1 * angka2;
            System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + hasil);
        } else if (pilihan == 4) {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + hasil);
            } else {
                System.out.println("Error: Tidak bisa membagi dengan angka 0!");
                valid = false;
            }
        } else {
            System.out.println("Pilihan menu tidak valid.");
            valid = false;
        }

        if (valid) {
            System.out.println("===============");
        }

        scanner.close();
    }
}

