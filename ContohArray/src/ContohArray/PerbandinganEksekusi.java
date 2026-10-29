/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContohArray;

/**
 *
 * @author LENOVO
 */
public class PerbandinganEksekusi {
    public static void main(String[] args) {
        int jumlahIterasi = 100000;

        long waktuMulaiString = System.nanoTime();
        String teks = "";
        for (int i = 0; i < jumlahIterasi; i++) {
            teks += i;
        }
        long waktuSelesaiString = System.nanoTime();
        long durasiString = waktuSelesaiString - waktuMulaiString;

        long waktuMulaiSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jumlahIterasi; i++) {
            sb.append(i);
        }
        String hasilSB = sb.toString();
        long waktuSelesaiSB = System.nanoTime();
        long durasiSB = waktuSelesaiSB - waktuMulaiSB;

        System.out.println("=== PERBANDINGAN WAKTU EKSEKUSI ===");
        System.out.println("Jumlah Iterasi : " + jumlahIterasi);
        System.out.println("Waktu String (+)     : " + (durasiString / 1_000_000.0) + " ms");
        System.out.println("Waktu StringBuilder  : " + (durasiSB / 1_000_000.0) + " ms");
    }
}
