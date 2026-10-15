/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumperulangan;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class PRAKTIKUM1PERULANGANfor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah total mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        System.out.println("\n--- Daftar Nomor Mahasiswa ---");
        
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + i);
        }

        input.close();
    }
}