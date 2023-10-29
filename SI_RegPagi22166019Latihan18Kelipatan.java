/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166019.latihan18.kelipatan;

/**
 *
 * @author ASUS
 * NAMA                 : Rachma Fadilah Kurnianto
 * KELAS                : PBO1
 * NIM                  : 222166019
 * Deskripsi Program    : Berisi cara menghitung kelipatan 3.5.
 */
public class SI_RegPagi22166019Latihan18Kelipatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("========== PROGRAM KELIPATAN ==========");
        
        //Hitung
        for (double i = 3.5; i <= 35; i += 0.5) {
            if (i % 3.5 == 0) {
                System.out.println(i);
            }
        }
    }
}