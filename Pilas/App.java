package Pilas;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        Nodo pila = new Nodo(6);
        pila.push(2);
        pila.push(9);
        pila.push(10);
        pila.push(8);
        pila.push(4);
        pila.push(5);
        
        System.out.println( pila.toString());
        System.out.println();
        System.out.println("El primer elemento es: " + pila.peek());
        System.out.println();
        System.out.println("El primer elemento a eliminar es: " + pila.pop());
        System.out.println();
        System.out.println("El elemento de la cima de la pila despues de la eliminacion es: " + pila.peek());


  }
}
