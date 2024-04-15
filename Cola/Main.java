
package Cola;


public class Main {
     public static void main(String[] args) {
        ColaObjetos cola = new ColaObjetos();

        cola.encolar("Hola");
        cola.encolar(123);
        cola.encolar(3.14);
        cola.encolar(true);

        System.out.println("Primer elemento de la cola: " + cola.primero());

        cola.desencolar();

        System.out.println("Elementos restantes en la cola:");
        while (!cola.estaVacia()) {
            System.out.println(cola.desencolar());
        }
    }
}
