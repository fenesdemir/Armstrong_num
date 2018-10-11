/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author user
 input*/
public class JavaApplication1 {
    public static void main (String args[]){
        
        int i, j;
        int sayi;
        int ust = 1;
        double toplam = 0;
        int bas_deg, temp;
            
        Scanner eno = new Scanner(System.in);
        System.out.println("Sayi giriniz:");
        sayi = eno.nextInt();
        System.out.println("Sayi: "+sayi);
        
        for(i=0;i<sayi;i++){
            if(sayi>Math.pow(10,i)){
                ust = i + 1;
            }
        }
        System.out.println("Ust : "+ust);
        temp = sayi;
        do{
            
            bas_deg = temp % 10;
            temp = temp / 10;
            System.out.println("Basamak degeri : "+bas_deg);
            toplam = toplam + Math.pow(bas_deg, ust);
        }while(temp>0);
        
         if(toplam==sayi){
        System.out.println("Sayi armstrong sayisidir.");
        } else{  
        System.out.println("Sayi armstrong sayisi degildir.");
        }
       
}
}
     

    /**
     * @param args the command line arguments
     */
  
