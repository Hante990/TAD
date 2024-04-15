
package Nodo;

public class Lista {
    Nodo inicio;
    int tamaño;

    public Lista(int value) {
         tamaño =value;
        inicio = null;
    }

    public Lista() {
            inicio = null;
     tamaño =40;
        
    }


    public void InsetarLista(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.next = inicio;
        inicio = nuevoNodo;
    }
    
    public void ImprimitLista(){
        Nodo temporal = inicio;
        while (temporal != null) {
            System.out.print(temporal.dato + " ");
            temporal = temporal.next;
        }
        System.out.println();
    }
}
