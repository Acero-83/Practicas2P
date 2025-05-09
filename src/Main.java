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
        cola.mostrar();*/
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
    }
}
