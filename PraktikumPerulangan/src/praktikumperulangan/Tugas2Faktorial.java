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
public class Tugas2Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int n = input.nextInt();
        
        long faktorial = 1;
        
        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            faktorial *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }
        
        System.out.println();
        System.out.println(n + "! = " + faktorial);
        
        input.close();
    }
}