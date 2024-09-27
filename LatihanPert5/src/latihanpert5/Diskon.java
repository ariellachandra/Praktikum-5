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
public class Diskon { 
   public static void main (String[] args){
       Scanner masukan = new Scanner(System.in);
       
       System.out.print ("Total Pembelian (Rp):  ");
       long beli = masukan.nextLong();
       
       double diskon;
       String potongan;
       if (beli >= 50000){
           diskon = 0.2 * beli;
       System.out.println ("Besarnya potongan   : Rp " + diskon);
       }else{
           diskon = 0.05 * beli;
       System.out.println ("Besarnya potongan            : Rp " + diskon);
       }
       
       System.out.println();
       
       double total = beli - diskon;
       System.out.println ("Jumlah yang harus dibayarkan : Rp " + total);
       
   } 
}
