/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_ronaldinhocccencho;

import java.util.Scanner;

/**
 *
 * @author Lab03
 */
public class persona {
    Scanner entrada =  new Scanner (System.in);
//atributos
    String nombre;
    int edad;
//metodos 
    public void preguntar(){
        System.out.println("Ingrese su nombre");
    nombre =entrada.next();
        System.out.println("Ingrese su edad");
    edad = entrada.nextInt() ;
    } 
    public void nombre(){
        System.out.println("Quien habla es :"+nombre);
    }
    public void edad(){
        System.out.println("La orden que dio es decir su :" + edad);
    }
}
