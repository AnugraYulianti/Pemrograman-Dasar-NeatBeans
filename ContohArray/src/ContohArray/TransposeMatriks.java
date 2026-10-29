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
public class TransposeMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[3][3];

        System.out.println("Masukkan nilai matriks 3x3 (tekan Enter setiap selesai 1 angka):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Baris " + (i + 1) + " Kolom " + (j + 1) + ": ");
                m[i][j] = input.nextInt();
                input.nextLine(); // Membersihkan sisa enter agar tidak jalan terus
            }
        }

        System.out.println("\nHasil Transpose Matriks:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[j][i] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}