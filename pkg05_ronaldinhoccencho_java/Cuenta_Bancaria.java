/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_ronaldinhoccencho_java;

import java.util.Scanner;

public class Cuenta_Bancaria {
    Scanner entrada = new Scanner (System.in);
    int saldo ;
    String usuario;
    
    public void monto (){
        System.out.println("Ingrese su monto");
        int saldo = entrada.nextInt();
    }
    public void name (){
        System.out.println("Ingrese su nombre");
        usuario = entrada.next();
    }
}
