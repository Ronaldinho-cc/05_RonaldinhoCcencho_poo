/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import paquete2.clase1;
import paquete2.clase2;
import paquete3.folder.clase3;
import paquete3.folder.clase4;

public class main {
  public static void main(String[]args){
    //clase privada
      clase4 obj4 = new clase4();
      clase3 obj3 = new clase3 ();
      
      //clase publica 
      clase1 obj1 = new clase1();
      clase2 obj2 = new clase2();
      
      obj1.c = "hola";
      obj2.a = "texto ";
    }
}
