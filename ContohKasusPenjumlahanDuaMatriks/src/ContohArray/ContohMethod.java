/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ContohArray;

/**
 *
 * @author LENOVO
 */
public class ContohMethod {
    static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    static void cetakHasil(double hasil){ 
          System.out.println (hasil);
         }
    public static void main(String[] args) {
           double luas = luasPersegiPanjang(5, 3);
           System.out.println("Luas: " + luas); // Luas: 15.0
           cetakHasil(luas);
    }
}
