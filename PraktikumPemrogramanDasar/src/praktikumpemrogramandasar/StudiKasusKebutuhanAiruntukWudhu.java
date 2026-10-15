/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumpemrogramandasar;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class StudiKasusKebutuhanAiruntukWudhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();

        System.out.print("Frekuensi wudhu : ");
        int frekuensiWudhu = input.nextInt();

        System.out.print("Air per wudhu (liter) : ");
        double airPerWudhu = input.nextDouble();

        double totalAir = jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
        double targetPenghematan = totalAir * 0.15;
        double airSetelahEfisiensi = totalAir - targetPenghematan;

        System.out.println("\n=== HASIL ===");
        System.out.println("Total kebutuhan air awal = " + totalAir + " liter");
        System.out.println("Target penghematan (15%) = " + targetPenghematan + " liter");
        System.out.println("Kebutuhan air setelah efisiensi = " + airSetelahEfisiensi + " liter");

        input.close();
    }
}