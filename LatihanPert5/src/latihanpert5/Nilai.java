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
public class Nilai {    
    public static void main (String[] args){
        Scanner masukan = new Scanner (System.in);
        Scanner masukan2 = new Scanner (System.in);
        Scanner masukan3 = new Scanner (System.in);
        
        System.out.println ("======INPUT======");
        System.out.print("NPM            : ");
        long npm = masukan3.nextLong();
        System.out.print("Nama Mahasiswa : ");
        String name = masukan2.nextLine();
        System.out.print("Nilai Kehadiran: ");
        int nilaihadir = masukan.nextInt();
        System.out.print("Nilai Tugas    : ");
        int nilaitgs = masukan.nextInt();
        System.out.print("Nilai UTS      : ");
        int nilaiuts = masukan.nextInt();
        System.out.print("Nilai UAS      : ");
        int nilaiuas = masukan.nextInt();
        
        double rata = (0.1 * nilaihadir) + (0.2 * nilaitgs) + (0.3 * nilaiuts) + (0.4 * nilaiuas);
        
        char grade;
        String keterangan;
        if (rata >= 76){
          grade = 'A';
          keterangan = "ISTIMEWA";
        }else if (rata >= 66){
          grade = 'B';
          keterangan = "BAIK";
        }else if (rata >= 56){
           grade = 'C';
           keterangan = "CUKUP";
        }else if (rata >= 46){
           grade = 'D';
           keterangan = "KURANG"; 
        }else{
           grade = 'E';
           keterangan = "KURANG SEKALI";
        }
        
        System.out.println ();
        System.out.println ();
        System.out.println ("======OUTPUT======");
        System.out.println ("NPM            : " + npm);
        System.out.println ("Nama Mahasiswa : " + name);
        System.out.println ("Nilai Rata-rata: " + rata);
        System.out.println ("Grade          : " + grade);
        System.out.println ("Keterangan     : " + keterangan);
    }
}
