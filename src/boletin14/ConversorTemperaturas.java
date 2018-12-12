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
public class ConversorTemperaturas {
    private static float temperatura=80;
    
    public void centigradosAFharenheit (float temp)throws TemperaturaErradaExcepcion{
   if(temp<temperatura)
    throw new TemperaturaErradaExcepcion("Has introducido un valor que no es válido, introduzca uno mayor a 80");
   else
       JOptionPane.showMessageDialog(null,temp+" grados centigrados son: "+(9/5*temp+32.4)+" Fharenheir"); 
   
    }
    
     public void centígradosAReamur(float temp) throws Exception{
   if(temp<temperatura)
     throw new Exception("Has introducido un valor que no es válido, introduzca uno mayor a 80");
   else
       JOptionPane.showMessageDialog(null,temp+" grados centigrados son: "+(4.0/5.0*temp)+" Reamur"); 
    }
}
