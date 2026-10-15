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
public class CASE3MENUPROGRAM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Menampilkan angka 1-10");
            System.out.println("2. Menampilkan bilangan genap");
            System.out.println("3. Menghitung jumlah 1-10");
            System.out.println("4. Menggambar segitiga bintang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nAngka 1 sampai 10:");
                    for (int i = 1; i <= 10; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("\nMasukkan batas akhir angka genap: ");
                    int batas = input.nextInt();
                    System.out.println("Bilangan genap hingga " + batas + ":");
                    for (int i = 1; i <= batas; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    int total = 0;
                    for (int i = 1; i <= 10; i++) {
                        total += i;
                    }
                    System.out.println("\nJumlah angka dari 1 sampai 10 adalah: " + total);
                    break;

                case 4:
                    System.out.print("\nMasukkan tinggi segitiga: ");
                    int tinggi = input.nextInt();
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("\nProgram selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 5);

        input.close();
    }
}
