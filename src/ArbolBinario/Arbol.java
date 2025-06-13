package ArbolBinario;

public class Arbol {
    Nodo raiz;
    public Arbol() {
        raiz = null;
    }
    public void insertar(int dato){
        raiz=insertarRec(raiz,dato);
    }
    //Metodo recursivo
    private Nodo insertarRec(Nodo actual, int dato){
        if (actual==null){
            return new Nodo(dato);
        }
        if (dato< actual.dato){
            actual.izquierdo = insertarRec(actual.izquierdo, dato);
        }
        if (dato>=actual.dato){
            actual.derecho = insertarRec(actual.derecho, dato);
        }
        return actual;
    }

    public void inorder(){
        inorderRec(raiz);
        System.out.println();
    }
    private void inorderRec(Nodo nodo){
        if (nodo!=null){
            inorderRec(nodo.izquierdo);
            System.out.print(nodo.dato+" ");
            inorderRec(nodo.derecho);
        }
    }

}
