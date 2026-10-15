/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumperulangan;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class CHALLENGEINTEGRATIFMENUPOLABINTANG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU POLA =====");
            System.out.println("1. Segitiga");
            System.out.println("2. Segitiga Terbalik");
            System.out.println("3. Persegi");
            System.out.println("4. Piramida");
            System.out.println("5. Diamond");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 5) {
                System.out.print("Masukkan tinggi: ");
                int tinggi = input.nextInt();
                System.out.println();

                switch (pilihan) {
                    case 1:
                        for (int i = 1; i <= tinggi; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;

                    case 2:
                        for (int i = tinggi; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;

                    case 3:
                        for (int i = 1; i <= tinggi; i++) {
                            for (int j = 1; j <= tinggi; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;

                    case 4:
                        for (int i = 1; i <= tinggi; i++) {
                            for (int j = 1; j <= tinggi - i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 1; k <= (2 * i - 1); k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;

                    case 5:
                        for (int i = 1; i <= tinggi; i++) {
                            for (int j = 1; j <= tinggi - i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 1; k <= (2 * i - 1); k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        for (int i = tinggi - 1; i >= 1; i--) {
                            for (int j = 1; j <= tinggi - i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 1; k <= (2 * i - 1); k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                }
            } else if (pilihan == 6) {
                System.out.println("\nProgram selesai. Terima kasih!");
            } else {
                System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 6);

        input.close();
    }
}