/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S07_05;

/**
 *
 * @author LAB12
 */
public class Main_s07_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       persona1_05 hum1 =new persona1_05();
       persona2_05 hum2 =new persona2_05();
       //persona 1 parametros
       hum1.hablar("HOLA ");
       hum1.caminar("camine");
      
       //persona2 return 
        System.out.println(hum2.persona2());
        System.out.println(hum2.persona3()); 
    }
    
}
