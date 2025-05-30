package Recursividad;

public class EjPropuestos30Mayo {
    // Comparar 2 vectores utilizando recursividad
    public static boolean compararVectores(int[] vector1, int[] vector2,int primerIndice) {
        if (vector1.length != vector2.length) {
            return false;
        }
        if (primerIndice == vector1.length) {
            return true;
        }
        if (vector1[primerIndice] != vector2[primerIndice]) {
            return false;
        }
        return compararVectores(vector1, vector2, primerIndice + 1);
    }
    //Calcular el maximo de un vector utilizando recursividad
    public static int maximoVector (int[] vector,int primerIndice,int primerValor) {
        if (primerIndice == vector.length) {
            return primerValor;
        }
        if (vector[primerIndice]>primerValor) {
            primerValor=vector[primerIndice];
        }
        return maximoVector(vector, primerIndice + 1, primerValor);
    }
    // Comparar dos matrices 2x2x2 con recursividad
    //{{1 2} {3 4}}            {{1 2 } {3 4}}
    //{{5 6}  {7 8}}           {{4 5 } {7 8}}


    public static boolean comparar2x2 (int [][][] matriz1,int [][][] matriz2,int i,int j, int k ) {
        //Son matrices iguales
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length ||
                matriz1[0][0].length != matriz2[0][0].length) {
            return false;
        }
        if (i==matriz1.length){
            return true;
        }
        if (matriz1[i][j][k] != matriz2[i][j][k]) {
            return false;
        }
        if (k + 1 < matriz1[0][0].length) {
            return comparar2x2(matriz1, matriz2, i, j, k + 1);
        } else if (j + 1 < matriz1[0].length) {
            return comparar2x2(matriz1, matriz2, i, j + 1, 0);
        } else {
            return comparar2x2(matriz1, matriz2, i + 1, 0, 0);
        }
    }

    public static int mayor2x2x2 (int [][][] matriz1,int i,int j, int k,int maximo){
        if (i==matriz1.length){
            return maximo;
        }
        if (matriz1[i][j][k] > maximo) {
            maximo = matriz1[i][j][k];
        }
        if (k + 1 < matriz1[0][0].length) {
            return mayor2x2x2(matriz1, i, j, k + 1, maximo);
        } else if (j + 1 < matriz1[0].length) {
            return mayor2x2x2(matriz1, i, j+1, 0, maximo);
        } else {
            return mayor2x2x2(matriz1, i+1, 0, 0, maximo);
        }
    }
}

