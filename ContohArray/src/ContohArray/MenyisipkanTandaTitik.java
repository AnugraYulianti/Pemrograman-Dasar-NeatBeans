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
public class MenyisipkanTandaTitik {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        String angkaStr = scanner.nextLine();

        StringBuilder sb = new StringBuilder(angkaStr);
        sb.reverse();

        StringBuilder hasil = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (i > 0 && i % 3 == 0) {
                hasil.append('.');
            }
            hasil.append(sb.charAt(i));
        }

        hasil.reverse();
        System.out.println("Hasil dengan pemisah ribuan: " + hasil.toString());
        scanner.close();
    }
}