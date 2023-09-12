/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

/**
 *
 * @author GIGABYTE
 */
public class main {
  public static void main(String[] args) {
    persona p1 = new persona();
    persona p2 = new persona();
   
    //sobrecarga de metodos , parametros y argumentos
    p1.metodo1(17);
    p1.metodo1("luis");
    
    p2.metodo1("carlos");
    p2.metodo1(18);
    
    //objetos
    p1.caminar();
    p1.hablar();
    
    // valore de retorno
      System.out.println("lo que dice el texto "+p1.name());
      System.out.println("mi edad es "+ p1.edad());
      System.out.println("el boleaano es "+ p1.metodo3());
    
  }
}
