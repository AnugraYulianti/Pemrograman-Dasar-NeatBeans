/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subcpmk2;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author LENOVO
 */
public class PermainanTebakAngka {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int angkaRahasia = random.nextInt(100) + 1;
        int maxPercobaan = 7;
        boolean berhasil = false;

        System.out.println("=== PERMAINAN TEBAK ANGKA (1 - 100) ===");
        System.out.println("Anda memiliki " + maxPercobaan + " kali kesempatan.\n");

        for (int percobaan = 1; percobaan <= maxPercobaan; percobaan++) {
            System.out.print("Tebakan ke-" + percobaan + ": ");
            int tebakan = scanner.nextInt();

            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar");
            } else {
                System.out.println("Benar! Anda berhasil menebak dalam " + percobaan + " percobaan.");
                berhasil = true;
                break;
            }
            System.out.println();
        }

        if (!berhasil) {
            System.out.println("\nKesempatan habis! Angka rahasianya adalah: " + angkaRahasia);
        }

        scanner.close();
    }
}