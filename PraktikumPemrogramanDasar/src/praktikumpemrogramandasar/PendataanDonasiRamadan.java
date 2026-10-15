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
public class PendataanDonasiRamadan {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("=== PENDATAAN 3 DONATUR ===");

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nData Donatur " + i);
            
            System.out.print("Nama : ");
            String nama = input.nextLine();

            System.out.print("Jenis donatur : ");
            String jenis = input.nextLine();

            System.out.print("Jumlah donasi : ");
            double donasi = input.nextDouble();
            input.nextLine();

            System.out.print("Kode transaksi : ");
            String kode = input.nextLine();

            System.out.print("Anonim (true/false) : ");
            boolean anonim = input.nextBoolean();
            input.nextLine();

            System.out.println("\nHasil " + i + " : ");
            System.out.println("No : " + i);
            System.out.println("Nama : " + nama);
            System.out.println("Donasi : " + (int)donasi);
            System.out.println("Anonim : " + anonim);
            System.out.println("Hasil : Pass");
            
            if (i < 3) {
                System.out.print("\nLanjut ke data berikutnya? (ketik 'berhenti' untuk stop, atau Enter untuk lanjut): ");
                String statusHenti = input.nextLine();
                if (statusHenti.equalsIgnoreCase("berhenti")) {
                    break;
                }
            }
        }

        input.close();
    }
}