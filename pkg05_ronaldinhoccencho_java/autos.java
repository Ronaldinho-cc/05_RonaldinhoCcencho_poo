/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_ronaldinhoccencho_java;

import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class autos {
   String marca ;
   String color;
   Scanner entrada = new Scanner (System.in);
   public void marca(){
       System.out.println("Ingrese la marca de su auto");
       marca = entrada.next();
   }
   public void color (){
       System.out.println("Ingrese su color del auto");
       color = entrada.next();
   }
}
