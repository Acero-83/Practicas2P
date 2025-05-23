package Recursividad;

import java.util.Scanner;

public class EjerciciosPropuestos {
    //Suma de elementos de un vector
    public static int sumaVector (int [] vector, int primerIndice){
        if (primerIndice>=vector.length){
            return 0;
        } else {
            return vector[primerIndice]+ sumaVector(vector,primerIndice+1);
        }
    }
    // Invertir una cadena con recursividad
    public static String invertirCadena(String cadena){
        if (cadena.isEmpty()){
            return cadena;
        } else {
            return cadena.charAt(cadena.length()-1)+invertirCadena(cadena.substring(0,cadena.length()-1));
        }
    }
    //Calcular el promedio de un vector con recursividad
    // 1 2 3
    // 0 1 2
    public static float promedioVector (int [] vector, int tamaño){
        if (tamaño<=0){
          return 0;
        } else {
            return (vector[tamaño-1]+(promedioVector(vector,tamaño-1)*(tamaño-1)))/tamaño;
        }
    }
    // Calcular la potencia de un número con recursividad
    public static int potencia (int a, int b){
        if (b<=0){
            return 1;
        }else {
            return a*potencia(a,b-1);
        }
    }
}
