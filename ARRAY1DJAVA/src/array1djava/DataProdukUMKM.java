/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array1djava;

/**
 *
 * @author LENOVO
 */
public class DataProdukUMKM {
    public static void main(String[] args) {
        double[] harga = {15000, 25000, 12000, 30000, 45000};
        double total = 0;
        double max = harga[0];
        double min = harga[0];

        System.out.println("=== DAFTAR HARGA & DISKON (MINIMAL Rp30.000 DAPAT DISKON 10%) ===");
        for (int i = 0; i < harga.length; i++) {
            total += harga[i];

            if (harga[i] > max) {
                max = harga[i];
            }
            if (harga[i] < min) {
                min = harga[i];
            }

            double hargaAkhir = harga[i];
            String keterangan = "Tanpa Diskon";
            
            if (harga[i] >= 30000) {
                double diskon = harga[i] * 0.10;
                hargaAkhir = harga[i] - diskon;
                keterangan = "Diskon 10% (Potongan: Rp" + diskon + ")";
            }

            System.out.println("Harga awal: Rp" + harga[i] + " -> " + keterangan + " -> Harga akhir: Rp" + hargaAkhir);
        }

        double rataRata = total / harga.length;

        System.out.println("\n=== RINGKASAN ===");
        System.out.println("Total harga = Rp" + total);
        System.out.println("Rata-rata harga = Rp" + rataRata);
        System.out.println("Harga tertinggi = Rp" + max);
        System.out.println("Harga terendah = Rp" + min);
    }
}
