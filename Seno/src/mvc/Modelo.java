
/*
Nombre: Julian David Diaz Melo
Asignatura: PVVS
Profesor: Alonso Guevara Perez
Fecha: 15/02/2020
*/

package mvc;

public class Modelo{

    public double Mod(double i) {
        
        //Se crean las variables que llegaremos a usar
        double termino = 0;
        double sumatotal = 0;
        int signo = 1;
        int factorial = 1;
        
        //Iniciamos con la operacion
        for (int a = 0; a <= i; a++){

            //Operamos el angulo junto con la operacion correspondiente
            double valor = Math.pow(i, 2*a+1);

            //Sacamos el factorial 
            int fac = 2*a+1;
            for (int x = fac; x > 0; x--){
                factorial = factorial*x;
            }

            //Unimos todas las operaciones anteriores para sacar el valor del termino
            termino = Math.pow(signo, a)*(Math.toRadians(valor)/factorial);
            signo = -1;

            //Vamos guardando y sumando las respectivas operaciones en la variable sumatotal
            sumatotal += termino;
        }
        
        //Se retorna la respuesta correspondiente
        return sumatotal;
    }
    
}
