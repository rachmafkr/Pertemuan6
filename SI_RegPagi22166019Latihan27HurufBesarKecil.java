/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166019.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 * @author ASUS
 * NAMA                 : Rachma Fadilah Kurnianto
 * KELAS                : PBO1
 * NIM                  : 222166019
 * Deskripsi Program    : Berisi cara menampilkan huruf besar dan kecil dengan input kalimat dari user.
 */
public class SI_RegPagi22166019Latihan27HurufBesarKecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        System.out.println();
        
        System.out.println("============Hasil Formatting===========");
        System.out.println("Huruf besar: " + kalimat.toUpperCase());
        System.out.println("Huruf kecil: " + kalimat.toLowerCase());
    }
}
    
