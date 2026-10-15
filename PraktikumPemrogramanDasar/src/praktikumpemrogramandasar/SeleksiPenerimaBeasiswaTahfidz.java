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
public class SeleksiPenerimaBeasiswaTahfidz {
   public static void main(String[] args) { 
   Scanner input = new Scanner(System.in);

        System.out.print("IPK : ");
        double ipk = input.nextDouble();

        System.out.print("Hafalan (juz) : ");
        int hafalan = input.nextInt();

        if (ipk >= 3.25 && hafalan >= 5) {
            System.out.println("Memenuhi syarat beasiswa.");
        } else {
            System.out.println("Belum memenuhi syarat beasiswa.");
        }

        System.out.print("Masukkan jumlah donasi: Rp");
        double donasi = input.nextDouble();

        if (donasi >= 5000000) {
            System.out.println("Kategori: Donatur Utama");
        } else if (donasi >= 1000000) {
            System.out.println("Kategori: Donatur");
        } else if (donasi >= 500000) {
            System.out.println("Kategori: Donatur Pendukung");
        } else {
            System.out.println("Kategori: Partisipan");
        }

        input.close();
    }
}