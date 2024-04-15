
package Cola;

import java.util.LinkedList;

public class ColaObjetos {
    private LinkedList<Object> elementos;

    public ColaObjetos() {
        this.elementos = new LinkedList<>();
    }

    public void encolar(Object elemento) {
        this.elementos.add(elemento);
    }

    public Object desencolar() {
        return this.elementos.poll();
    }

    public Object primero() {
        return this.elementos.peek();
    }

    public int tamaño() {
        return this.elementos.size();
    }

    public boolean estaVacia() {
        return this.elementos.isEmpty();
    }
}
