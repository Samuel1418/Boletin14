/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConversorTemperaturas obx = new ConversorTemperaturas();
         try{
             float temp=Float.parseFloat(JOptionPane.showInputDialog(null,"introduzca valor de grados superior a 80 que quiera pasar a Fharenheit"));
             obx.centigradosAFharenheit(temp);
         }catch(TemperaturaErradaExcepcion ex){
             System.out.println(ex.getMessage());
         }
         try{
             float temp=Float.parseFloat(JOptionPane.showInputDialog(null,"introduzca valor de grados superior a 80 que quiera pasar a Reamur"));
             obx.centígradosAReamur(temp);
         }catch(Exception ex){
             System.out.println(ex.getMessage());
         }
       
    JOptionPane.showMessageDialog(null,"FIN del PROGRAMA"); 
    }
}
    

