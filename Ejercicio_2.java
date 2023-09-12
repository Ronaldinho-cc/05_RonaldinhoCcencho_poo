/*La calificacion finales de un estudiantes de sistemas se calcularan en cuatro
calificaciones en los aspectos de : participacion . primerExamen, segundoExamen
examenFinal. Sabiendo que las notas anteriores entran con un extra del 10%,25%
,25%,40%. Hacer un programa que calcule  e imprima la nota final del estudiante 
*/
package ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[]args){
   Scanner entrada = new Scanner (System.in);
   float participacion,primerExamen,segundoExamen,examenFinal,notaFinal;
        System.out.println("Digite la nota de participacion:");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del primer examen parcial: ");
        primerExamen = entrada.nextFloat();
        System.out.println("Digite la nota del segundo parcial: ");
        segundoExamen = entrada.nextFloat();
        System.out.println("Digite la nota del examen final: ");
        examenFinal = entrada.nextFloat();
        participacion *= 0.10f;
        primerExamen *=0.25f;
        segundoExamen *=0.25f;
        examenFinal *=0.40f;
        //suma de las notas 
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        //Imprimimos el resultado final
        System.out.println("La nota final es : "+notaFinal);
             
    }
}
