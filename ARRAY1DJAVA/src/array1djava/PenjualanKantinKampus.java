/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array1djava;

/**
 *
 * @author LENOVO
 */
public class PenjualanKantinKampus {
    public static void main(String[] args) {
        int[] penjualan = {25, 30, 18, 40, 35, 45, 50};

        int total = 0;
        int max = penjualan[0];
        int min = penjualan[0];
        int hariMinimal30 = 0;

        for (int i = 0; i < penjualan.length; i++) {
            total += penjualan[i];

            if (penjualan[i] > max) {
                max = penjualan[i];
            }
            if (penjualan[i] < min) {
                min = penjualan[i];
            }
            if (penjualan[i] >= 30) {
                hariMinimal30++;
            }
        }

        double rataRata = (double) total / penjualan.length;

        System.out.println("=== LAPORAN PENJUALAN ===");
        System.out.println("Total penjualan = " + total);
        System.out.println("Rata-rata penjualan = " + rataRata);
        System.out.println("Penjualan tertinggi = " + max);
        System.out.println("Penjualan terendah = " + min);
        System.out.println("Jumlah hari dengan penjualan minimal 30 = " + hariMinimal30);
    }
}
