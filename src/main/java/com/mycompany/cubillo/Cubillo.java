/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cubillo;
import javax.swing.JOptionPane;
/**
 *
 * @author Eric Rodriguez
 */
public class Cubillo {

    public static void main(String[] args) {
       int numero,cubo;
       numero= Integer.parseInt(JOptionPane.showInputDialog("Favor ingresar un numero, "));
       
       while (numero>= 0){
           cubo=(int)Math.pow(numero,3);
           
          JOptionPane.showMessageDialog(null, "El numero: "+numero+ "Al cubo es:" +cubo);
          
          numero= Integer.parseInt(JOptionPane.showInputDialog("Favor ingresar otro numero, "));
    }
}
}