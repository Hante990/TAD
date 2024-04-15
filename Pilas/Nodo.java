package Pilas;

public class Nodo {

    int array[];
    int tope;
    int max;

    public Nodo(int max) {
        this.array = new int[max];
        this.tope = -1;
        this.max = max;
    }

    public void push(int value) {
        if (tope == max - 1) {
            System.out.println("La pila esta llena");
        } else {
            array[++tope] = value;
        }
    }

    public int pop() {
        if (Empty()) {
            System.out.println("La pila esta vacía");
            return -1;
        }
        return array[tope--];
    }

    public int peek() {
        if (Empty()) {
            System.out.println("La pila está vacía. No hay ningún elemento en la cima.");
            System.out.println();
            return -1;
        }
        return array[tope];
    }

    public boolean Empty() {
        return (tope == -1);
    }

    public boolean isFull() {
        return (tope == max - 1);
    }

    public void showpila() {
        if (Empty()) {
            System.out.println("La pila está vacía.");
            return;
        }
        
        System.out.print("Contenido de la pila: ");
        for (int i = tope; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
