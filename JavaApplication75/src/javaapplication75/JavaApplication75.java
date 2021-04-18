/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication75;

import java.util.Scanner;

/**
 *
 * @author Hilal
 */
public class JavaApplication75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner deger = new Scanner(System.in);
        System.out.print("Lütfen 10'luk tabandaki sayıyı giriniz : ");
        int sayi = deger.nextInt();
        
        if (sayi == -1 ) 
        {
            return;
        }
        
        System.out.print("İkilik tabandaki karşılığı : " + tabanCevirme(sayi));
            
    }
    
     public static int tabanCevirme(int sayi){
        int kalan;
        if(sayi <= 0)
        {
            return sayi;
        }
        else
        {
            kalan = sayi%2;
            sayi = sayi/2;
            
            return kalan + 10*tabanCevirme(sayi);
        }
     }
}

