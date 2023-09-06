/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_ronaldinhocccencho;

import java.util.Scanner;

public class calculadora {
//atributos 

    int a;
    int b;
    int mul;
    int suma;
    int resta;
    int dividir ;
//metodos   
     public void ingresarDatos() {
         Scanner entrada = new Scanner (System.in);
         System.out.println("digitar el primer numero");
        a = entrada.nextInt();
         System.out.println("digitar el segundo numero");
        b = entrada.nextInt();
    }
    public void multiplicar() {
        mul = a * b;
         System.out.println("la multiplicación es;" + mul);
    }
    public void sumar (){
     suma = a + b;
         System.out.println("la suma es: " + suma);
    }
    public void resta(){
    resta = a - b;
        System.out.println("la resta es: " + resta);
    }
    public void división (){
      dividir = a / b;
           System.out.println( "la division es: " + dividir);
    }
      public void salida() {
        System.out.println("La suma es: " + suma + "\nLa resta es: " + resta + "\nLa multiplicacion es: " + mul + "\nLa division es: " + dividir );
    }
}
    
    

