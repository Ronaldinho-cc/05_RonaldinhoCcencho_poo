/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_ronaldinhocccencho;

import javax.swing.JOptionPane;

public class animales {
    String nombre , sexo ;
    
 public void Ingrese (){
 nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del animal");
 sexo = JOptionPane.showInputDialog(null,"Ingrese el sexo del animal");
 }
 public void nombre(){
    JOptionPane.showInputDialog(null,nombre);
 } 
 public void detalles (){
    JOptionPane.showInputDialog(null,sexo);
 }
}
