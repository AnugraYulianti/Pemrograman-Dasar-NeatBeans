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
public class SeleksiBantuanPendidikan {
    public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);

        System.out.print("IPK : ");
        double ipk = input.nextDouble();

        System.out.print("Penghasilan orang tua : ");
        double penghasilan = input.nextDouble();

        System.out.print("Jumlah tanggungan : ");
        int tanggungan = input.nextInt();

        System.out.print("Aktif kegiatan sosial (true/false) : ");
        boolean aktifSosial = input.nextBoolean();

        System.out.print("Menerima beasiswa lain (true/false) : ");
        boolean beasiswaLain = input.nextBoolean();

        if (ipk >= 3.50 && penghasilan <= 3000000 && tanggungan >= 3 && !beasiswaLain) {
            System.out.println("Prioritas Utama");
        } else if (ipk >= 3.00 && penghasilan <= 5000000 && !beasiswaLain) {
            System.out.println("Prioritas Kedua");
        } else if (aktifSosial && ipk >= 3.00 && !beasiswaLain) {
            System.out.println("Pertimbangan Khusus");
        } else {
            System.out.println("Belum memenuhi prioritas");
        }

        input.close();
    }
}
