/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_ronaldinhocccencho;


public class main  {

    public static void main(String[] args) {
        //class calculadora escaner
        calculadora objcalculadora = new calculadora();
        
        objcalculadora.ingresarDatos();
        objcalculadora.multiplicar();
        objcalculadora.sumar();
        objcalculadora.resta();
        objcalculadora.división();
        objcalculadora.salida();
        
       //scanner 
        persona persona1 = new persona(); 
     
        
        persona1.preguntar();
        persona1.nombre();
        persona1.edad();
       
       // class autos Joption
        autos autos1 = new autos();
        autos autos2 = new autos();
   
        autos1.ingresar();
        autos1.marca();
        autos1.color();
        autos1.km();
        
        
        //clases animales 
        
        animales animales1 = new animales();
        animales animales2 = new animales();
        
        animales1.Ingrese();
        animales1.nombre();
        animales1.detalles();
        
        
        
                
    }   
}