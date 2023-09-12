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
public class persona {
    //Atributos
    String nombre;
    int edad; 
    
    //sobrecarga metodos
    public void metodo1(String nombre){
        System.out.println("Mi nombre "+nombre);
    
    }
    public void metodo1(int edad){
        System.out.println("mi edad es:"+edad);
    }
    
    //metodos con retorno  string , int , boolean 
    public String name(){
    return "hola";
    }
    
    public int edad(){
    return 17 ;
    }
    public boolean metodo3(){
    return true ;
    }
    //2 metodos con parametros y argumentos 


    //2 objetos
    public void nombre(){
        System.out.println("Jose");
    }
    public void años(){
        System.out.println(17);
    }
    
}
