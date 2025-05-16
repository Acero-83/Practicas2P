package Recursividad;

public class Ejercicios {
    //Factorial de un numero
    public static int factorial (int n) {
        int f=0;
        if(n==1){
            //caso base
            f=1;
        } else {
            f=n*factorial(n-1);
        }
        return f;
    }

    //Maximo comun Divisor (MCD) con euclides
    public static int mcd(int a, int b){
        int maximo=0;
        if (a==b){
            //casobase
            maximo=b;
        }else{
            if (a>b){
                a= a-b;
            } else {
                b=b-a;
            }
            maximo=mcd(a,b);
        }
        return maximo;
    }

}
