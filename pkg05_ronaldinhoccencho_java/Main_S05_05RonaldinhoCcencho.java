/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_ronaldinhoccencho_java;

/**
 *
 * @author GIGABYTE
 */
public class Main_S05_05RonaldinhoCcencho {
   public static void main(String[] args) {
// ESTUDIANTE JoptionPane
       estudiante_05 per1 = new estudiante_05();
       
       per1.hablar();
       per1.accion();
       
       //Libro JoptionPane
       Libro title = new Libro();
       title.tema();
       
       
       //cuenta bancaria Scanner
       Cuenta_Bancaria data = new Cuenta_Bancaria();
       
       data.name();
       data.monto();
       
       //autos Scanner
       autos car = new autos();
       
       car.marca();
       car.color();
   }
        
        
  }


