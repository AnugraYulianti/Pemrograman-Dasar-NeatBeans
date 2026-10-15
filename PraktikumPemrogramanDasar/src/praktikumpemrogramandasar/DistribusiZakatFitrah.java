/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpemrogramandasar;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class DistribusiZakatFitrah {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Total beras (kg): ");
        int totalBeras = input.nextInt();

        System.out.print("Jumlah keluarga penerima: ");
        int jumlahKeluarga = input.nextInt();

        int berasPerKeluarga = totalBeras / jumlahKeluarga;
        int sisaBeras = totalBeras % jumlahKeluarga;

        System.out.println("\n=== HASIL DISTRIBUSI ===");
        System.out.println("Beras per keluarga = " + berasPerKeluarga + " kg");
        System.out.println("Sisa beras = " + sisaBeras + " kg");

        input.close();
    }
}
