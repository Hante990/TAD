
package Nodo;

public class Nodo {
    
    int dato;
    Nodo next;

    public Nodo(int inputDate) {
        
        dato = inputDate;
        next = null;
    }
    
    public void setNodo(Nodo apuntador) {
        next = apuntador;
    
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
}
