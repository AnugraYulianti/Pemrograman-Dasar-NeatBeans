/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasmandiri;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class AndiBelajarMatematika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PROGRAM MATEMATIKA ===");
        System.out.println("1. Operasi Pertambahan");
        System.out.println("2. Operasi Pengurangan");
        System.out.println("3. Operasi Pembagian");
        System.out.print("Masukkan pilihan (1/2/3): ");
        
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1 -> System.out.println("Operasi Pertambahan");
            case 2 -> System.out.println("Operasi Pengurangan");
            case 3 -> System.out.println("Operasi Pembagian");
            default -> System.out.println("Saya belajar perkalian");
        }

        scanner.close();
    }
}