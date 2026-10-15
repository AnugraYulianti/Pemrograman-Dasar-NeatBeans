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
public class STUDIKASUSPIRAMIDA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi piramida: ");
        int tinggi = scanner.nextInt();

        System.out.println();

        for (int i = 1; i <= tinggi; i++) {
            // Mencetak spasi
            for (int j = tinggi; j > i; j--) {
                System.out.print(" ");
            }
            // Mencetak bintang berdasarkan rumus
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
