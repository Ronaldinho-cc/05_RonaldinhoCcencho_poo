/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_ronaldinhocccencho;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab03
 */
public class autos {

  //atributos 
   String marca ;
   String color;
   int km;
    public void ingresar (){
    marca = JOptionPane.showInputDialog(null,"Ingrese la marca de su auto");
    color = JOptionPane.showInputDialog(null,"Ingrese el color de su auto");
    km = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la marca de su auto"));
    }
    public void marca (){
        System.out.println("la marca de su auto es:"+marca);
}
    public void color (){
        System.out.println("el color de su auto es :"+color);
    }
    public void km (){
        System.out.println("el kilometro de su auto es:"+km);}
} 
