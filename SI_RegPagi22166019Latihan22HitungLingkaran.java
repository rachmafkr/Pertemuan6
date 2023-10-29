/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166019.latihan22.hitunglingkaran;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * NAMA                 : Rachma Fadilah Kurnianto
 * KELAS                : PBO1
 * NIM                  : 222166019
 * Deskripsi Program    : menghitung Lingkaran.
 */
public class SI_RegPagi22166019Latihan22HitungLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double phi = 3.14;
        
        
        System.out.println("============Perhitungan Lingkaran===========");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        double diameter= input.nextInt();
        System.out.println();
  
        System.out.println("============Hasil Perhitungan Lingkaran===========");
        double jarijari = diameter / 2;
        double luas = phi * jarijari*jarijari;
        double keliling = 2 * phi * jarijari;
        System.out.println("Jari-jari Lingkaran = "+jarijari);
        System.out.println("Luas Lingkaran = "+luas);
        System.out.println("Keliling Lingkaran = "+keliling);
        
    }
}
    