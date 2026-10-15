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
public class STUDIKASUSPERSEGIPANJANG {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = scanner.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int jumlahKolom = scanner.nextInt();

        System.out.println();

        for (int i = 1; i <= jumlahBaris; i++) {
            for (int j = 1; j <= jumlahKolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
