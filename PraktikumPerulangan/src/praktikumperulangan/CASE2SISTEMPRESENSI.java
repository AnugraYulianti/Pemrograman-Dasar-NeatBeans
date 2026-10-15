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
public class CASE2SISTEMPRESENSI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah total mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        
        int jumlahHadir = 0;
        int jumlahTidakHadir = 0;
        
        System.out.println("\nMasukkan status kehadiran (1 = Hadir, 0 = Tidak Hadir):");
        
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            int status;
            
            while (true) {
                System.out.print("Mahasiswa ke-" + i + ": ");
                status = input.nextInt();
                if (status == 1 || status == 0) {
                    break;
                }
                System.out.println("Input salah! Masukkan 1 atau 0.");
            }
            
            if (status == 1) {
                jumlahHadir++;
            } else {
                jumlahTidakHadir++;
            }
        }
        
        double persentaseKehadiran = ((double) jumlahHadir / jumlahMahasiswa) * 100;
        
        System.out.println("\n--- Rekapitulasi Kehadiran ---");
        System.out.println("Jumlah Hadir       : " + jumlahHadir + " mahasiswa");
        System.out.println("Jumlah Tidak Hadir : " + jumlahTidakHadir + " mahasiswa");
        System.out.println("Persentase Kehadiran: " + String.format("%.2f", persentaseKehadiran) + "%");
        
        System.out.print("Status Keseluruhan : ");
        if (persentaseKehadiran >= 75.0) {
            System.out.println("Memenuhi syarat");
        } else {
            System.out.println("Tidak memenuhi syarat");
        }
        
        input.close();
    }
}