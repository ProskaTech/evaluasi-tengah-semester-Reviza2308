/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Scanner;

/**
 *Muhammad Reviza Dekry 21343031
 * @author Revskyyy
 */
public class soal2 {
     public static void main(String[]args){
         Scanner in = new Scanner(System.in);
         
         System.out.print("Masukan Jumlah baris :");
         int n = in.nextInt();
         
         for (int i = 1; i <=n; i++){
             for (int j = 1; j <i; j++)
           {
               System.out.print(" ");
           }
              for (int k = i; k <=n; k++)
           {
               System.out.print(" #");
           }
              System.out.println(" ");
         }
          for (int i = n; i >=1; i--){
             for (int j = 1; j <i; j++)
           {
               System.out.print(" ");
           }
              for (int k = i; k <=n; k++)
           {
               System.out.print(" *");
           }
              System.out.println(" ");
         }
     }
}
