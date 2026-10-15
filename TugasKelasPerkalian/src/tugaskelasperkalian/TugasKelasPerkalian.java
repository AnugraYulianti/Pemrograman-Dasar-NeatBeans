/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaskelasperkalian;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class TugasKelasPerkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("input angka = ");
        int angka = input.nextInt();

        System.out.println("output");
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }

        input.close();
    }
}
