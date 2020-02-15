
/*
Nombre: Julian David Diaz Melo
Asignatura: PVVS
Profesor: Alonso Guevara Perez
Fecha: 15/02/2020
*/

package mvc;

import java.util.Scanner;
import mvc.Modelo;
import mvc.Vista;

public class Seno {
    
    //Inicio del ejercicio
    
    public static void main(String[] args) {
        
        //Se crea las variables de cada clase
        Scanner sc = new Scanner(System.in);
        Modelo mod = new Modelo();
        Vista vis = new Vista();
        
        //Pedimos el valor del angulo que vamos a usar
        System.out.print("Ingrese el valor del Angulo: ");
        double ang = sc.nextInt();
        
        //Se realiza el respectivo llamado de las operaciones
        double valor = mod.Mod(ang);
        vis.vis(valor, ang);
    }
    
    //Finaliza el ejercicio
    
}
