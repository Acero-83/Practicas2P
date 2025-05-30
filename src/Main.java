import Recursividad.EjPropuestos30Mayo;
import Recursividad.Ejercicios;
import Recursividad.EjerciciosPropuestos;
import pc.Pila;

public class Main {
    public static void main(String[] args) {
        //insertar elementos a nuestra lista
        /* ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();
        System.out.println(listaSimplementeEnlazada.estaVacia());
        listaSimplementeEnlazada.insertar(5);
        listaSimplementeEnlazada.insertar(4);
        listaSimplementeEnlazada.insertar(3);
        listaSimplementeEnlazada.insertar(2);
        listaSimplementeEnlazada.insertar(1);
        listaSimplementeEnlazada.insertar(0);

        //mostramos la lista
        listaSimplementeEnlazada.mostrar();

        // eliminar algunos elementos
        listaSimplementeEnlazada.eliminar();
        listaSimplementeEnlazada.eliminar();

        //mostramos nuestra lista
        listaSimplementeEnlazada.mostrar();

        ListaDoblementeEnlazada listaDoblementeEnlazada = new ListaDoblementeEnlazada();
        System.out.println(listaDoblementeEnlazada.estaVacia());

        for (int i = 20; i > 0; i--) {
            listaDoblementeEnlazada.insertar(i);
        }
        System.out.println(listaDoblementeEnlazada.estaVacia());
        listaDoblementeEnlazada.mostrarAdelante();

        listaDoblementeEnlazada.eliminar();
        listaDoblementeEnlazada.eliminar();

        listaDoblementeEnlazada.mostrarAdelante();
        listaDoblementeEnlazada.mostrarAtras();

        ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada = new ListaCircularSimplementeEnlazada();
        System.out.println(listaCircularSimplementeEnlazada.estaVacia());
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        for (int i = 1; i <=12 ; i++) {
            listaCircularSimplementeEnlazada.insertarFin(i);
        }
        listaCircularSimplementeEnlazada.mostrar();
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

       listaCircularSimplementeEnlazada.mostrarCircular(2);


        ListaCircularDoblementeEnlazada listaCircularDoblementeEnlazada = new ListaCircularDoblementeEnlazada();

        System.out.println(listaCircularDoblementeEnlazada.estaVacio());
        for (int i = 1; i <= 5 ; i++) {
            listaCircularDoblementeEnlazada.insertarFinal(i);
        }
        listaCircularDoblementeEnlazada.mostrar();
        listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.mostrar();

        listaCircularDoblementeEnlazada.mostrarAdelante(8);
        listaCircularDoblementeEnlazada.mostrarAtras(8);

        Cola cola = new Cola();
        System.out.println(cola.estaVacia());

        for (int i = 0; i <=5; i++) {
            cola.insertar(i);
        }
        cola.mostrar();
        Pila pila = new Pila();
        System.out.println(pila.estaVacia());
        for (int i = 0; i <=5; i++) {
            pila.insertar(i);
        }
        pila.mostrar();
        pila.eliminar();
        pila.eliminar();
        pila.eliminar();
        pila.mostrar();
        System.out.println(Ejercicios.factorial(5));
        System.out.println(Ejercicios.mcd(412,184));
        int[] vector= {1,2,3,4,5};
        System.out.println(EjerciciosPropuestos.sumaVector(vector,0));
        String palabra="hugo";
        System.out.println(EjerciciosPropuestos.invertirCadena(palabra));
        int[] vector= {1,2,3,4,5};
        System.out.println(EjerciciosPropuestos.promedioVector(vector,5));
        System.out.println(EjerciciosPropuestos.potencia(2,3));
        int[] vector1= {1,2,3,4,5};
        int[] vector2= {1,2,3,4,5};
        System.out.println(ejPropuestos30Mayo.compararVectores(vector1,vector2,0));
        int[] vector= {1,2,3,4,5};
        EjPropuestos30Mayo ejercicio = new EjPropuestos30Mayo();
        System.out.println(ejercicio.maximoVector(vector,1, vector[0]));*/
        EjPropuestos30Mayo ejercicio = new EjPropuestos30Mayo();
        int[][][] matriz1 = {
                { {1, 2}, {3, 4} },
                { {5, 6}, {7, 4} }
        };

        int[][][] matriz2 = {
                { {1, 2}, {3, 4} },
                { {5, 6}, {7, 8} }
        };
        System.out.println(ejercicio.comparar2x2(matriz1,matriz2,0,0,0));
        System.out.println(ejercicio.mayor2x2x2(matriz1,0,0,0,0));
    }
}
