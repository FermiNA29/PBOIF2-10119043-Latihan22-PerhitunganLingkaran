/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program hitung lingkaran dari diameter
 */
public class PBOIF210119043Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    
    public static void inputDiameter() {
        Scanner scanner = new Scanner(System.in);
        int diameter;
        int a;
        System.out.println("===== Perhitungan Lingkaran =====");
        do {
            
            try {
                a = 0;
                System.out.print("Masukan diameter lingkaran : ");
                diameter = scanner.nextInt();
                hitungLingkaran(diameter);
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Nilai diameter tidak sesuai");
                 a = 1;
                 scanner.nextLine();
            }
        } while(a == 1);
        
    }
    
    public static void hitungLingkaran(int diameter) {
        int jariJari = diameter/2;
        double phi = 3.14;
        double luas = phi * jariJari * jariJari;
        double keliling = phi * diameter;
        
        System.out.println();
        System.out.println("===== Hasil Perhitungan Lingkaran =====");
        System.out.println("Jari-jari lingkaran\t : " + jariJari);
        System.out.println("luas lingkaran\t\t : " + luas);
        System.out.println("Keliling lingkaran\t : " + keliling);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        inputDiameter();
    }
    
}
