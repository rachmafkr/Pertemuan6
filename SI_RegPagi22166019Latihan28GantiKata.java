/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166019.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * NAMA                 : Rachma Fadilah Kurnianto
 * KELAS                : PBO1
 * NIM                  : 222166019
 * Deskripsi Program    : Berisi cara mengganti kata.
 */
public class SI_RegPagi22166019Latihan28GantiKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("============Program Mengganti Kata===========");
        System.out.println();
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        
        System.out.print("Ganti kata : ");
        String kataLama = input.nextLine();
        
        System.out.print("Menjadi kata : ");
        String kataBaru = input.nextLine();
        
        String kalimatBaru = kalimat.replace(kataLama, kataBaru);
        
        System.out.println();
        System.out.println("============Hasil Formatting===========");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);
    }
}