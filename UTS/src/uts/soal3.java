/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import javax.swing.JOptionPane;

/**
 *
 * @author Revskyyy
 */
public class soal3 {
    public static void main(String[] args) {
                String angka = "";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int input = Integer.valueOf(angka).intValue();
        String hasil = "";
        
        hasil += "Angka yang dimasukkan  : " +angka +"\n" ;
        if (input >= 0) {
            hasil += "Bilangan yang dimasukkan adalah bilangan positif";
            
        } else {
            hasil += "Bilangan yang dimasukkan adalah bilangan negatif";
            
        }
        
        JOptionPane.showMessageDialog(null, hasil);
    }
    }

