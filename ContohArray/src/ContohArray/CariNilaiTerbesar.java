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
public class CariNilaiTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[3][3];

        System.out.println("Masukkan nilai matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Baris " + (i + 1) + " Kolom " + (j + 1) + ": ");
                m[i][j] = input.nextInt();
            }
        }

        int maks = m[0][0];
        int barisMax = 0;
        int kolomMax = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[i][j] > maks) {
                    maks = m[i][j];
                    barisMax = i;
                    kolomMax = j;
                }
            }
        }

        System.out.println("\nMatriks:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nNilai terbesar adalah: " + maks);
        System.out.println("Berada pada posisi Baris ke-" + (barisMax + 1) + ", Kolom ke-" + (kolomMax + 1));

        input.close();
    }
}
