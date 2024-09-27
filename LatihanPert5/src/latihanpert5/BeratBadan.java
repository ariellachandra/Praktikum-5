/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpert5;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class BeratBadan {
    public static void main (String[] args){
        Scanner masukan = new Scanner (System.in);
        
        System.out.print ("Berat Badan (kg) : ");
        int berat = masukan.nextInt();
        System.out.print ("Tinggi Badan (cm): ");
        int tinggi = masukan.nextInt();
        
        System.out.println();
        
        double tinggiMeter = tinggi/100.0;
        double imt = (berat/(tinggiMeter*tinggiMeter));
        System.out.println ("Nilai IMT : " + imt);
        
        String kriteria;
        if(imt >= 40){
            kriteria = "Sangat Gemuk";
        }else if(imt >= 30){
            kriteria = "Gemuk";
        }else if(imt >= 25){
            kriteria = "Berat Badan Lebih";
        }else if(imt >= 18.5){
            kriteria = "Berat Badan Ideal";
        }else{
            kriteria = "Berat Badan Kurang";
        }
        
        
        System.out.println ("Kriteria  : " + kriteria);
    }
}
