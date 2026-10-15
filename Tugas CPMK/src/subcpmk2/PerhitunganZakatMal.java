/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subcpmk2;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class PerhitunganZakatMal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total harta: ");
        double harta = scanner.nextDouble();

        System.out.print("Masukkan nilai nisab: ");
        double nisab = scanner.nextDouble();

        if (harta >= nisab) {
            double zakat = harta * 0.025;
            System.out.println("Jumlah zakat yang harus dibayar: " + zakat);
        } else {
            System.out.println("Harta belum mencapai nisab.");
        }

        scanner.close();
    }
}
