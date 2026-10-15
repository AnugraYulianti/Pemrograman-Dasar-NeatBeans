/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumperulangan;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class CASE1SIMULASITABUNGAN {
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bulan simulasi: ");
        int jumlahBulan = input.nextInt();
        
        double totalTabungan = 0;
        int bulanMencapaiTarget = -1; 
        
        System.out.println("\n--- Rincian Tabungan Setiap Bulan ---");
        
        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
      
            double tabunganBulanIni = 100000 + (bulan - 1) * 50000;
            
            System.out.println("Bulan ke-" + bulan + ": Rp" + String.format("%,.0f", tabunganBulanIni));
            
            totalTabungan += tabunganBulanIni;
            
            if (totalTabungan >= 1000000 && bulanMencapaiTarget == -1) {
                bulanMencapaiTarget = bulan;
                
            }
        }
        
        System.out.println("\n--- Hasil Akhir ---");
        
        System.out.println("Total tabungan keseluruhan: Rp" + String.format("%,.0f", totalTabungan));
        
        if (bulanMencapaiTarget != -1) {
            System.out.println("Total tabungan pertama kali mencapai Rp1.000.000 pada: Bulan ke-" + bulanMencapaiTarget);
        } else {
            System.out.println("Dalam " + jumlahBulan + " bulan, total tabungan belum mencapai Rp1.000.000.");
        }
        
        input.close();
    }
}