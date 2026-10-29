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
public class MenghapusSemuaSpasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);
            if (karakter != ' ') {
                sb.append(karakter);
            }
        }

        System.out.println("Hasil tanpa spasi: " + sb.toString());

        scanner.close();
    }
}
