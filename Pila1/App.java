package Pila1;

import java.util.Stack;
import java.util.StringTokenizer;

public class App {

    public static void main(String[] args) {
        String sTexto = "( 3 + 4 )"; //Pila
        metodo(sTexto);
    }

    private static void metodo(String sTexto) {
        Stack pila = new Stack();
        StringTokenizer stTexto = new StringTokenizer(sTexto);
        int palabras = stTexto.countTokens();
        for (int x = 0; x < palabras; x++) {
            String sCadena = stTexto.nextToken();
            System.out.println(sCadena);
            if (sCadena.equals("(")) {
                pila.push(sCadena);
            } else if (sCadena.equals(")")) {
                pila.pop();
            }

            switch (sCadena) {
                case "(":
                    pila.push(sCadena);
                    break;
                case "[":
                    pila.push(sCadena);
                    break;
                case "{":
                    pila.push(sCadena);
                    break;
                case ")":
                    pila.pop();
                    break;
                case "]":
                    pila.pop();
                    break;
                case "}":
                    pila.pop();
                    break;

            }

            if (pila.empty()) {
                System.out.println("");
            }
        }
    }
}