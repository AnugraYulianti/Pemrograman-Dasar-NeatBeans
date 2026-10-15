/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array1djava;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class KehadiranMahasiswa {
    public static void main(String[] args) {
        int[] hadir = {14, 13, 16, 12, 15, 10, 16, 14};
        int totalPertemuan = 16;
        double batasMinimal = 75.0;

        System.out.println("=== LAPORAN PERSENTASE KEHADIRAN ===");
        for (int i = 0; i < hadir.length; i++) {
            double persentase = ((double) hadir[i] / totalPertemuan) * 100;
            
            System.out.print("Siswa/Data ke-" + (i + 1) + " (" + hadir[i] + " hadir): " + persentase + "% -> ");
            
            if (persentase >= batasMinimal) {
                System.out.println("Mencapai minimal 75%");
            } else {
                System.out.println("Tidak mencapai minimal 75%");
            }
        }
    }
}