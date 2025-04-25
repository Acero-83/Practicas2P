import lse.ListaSimplementeEnlazada;

public class Main {
    public static void main(String[] args) {
        //insertar elementos a nuestra lista
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();
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

    }
}
