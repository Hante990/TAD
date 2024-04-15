package Lista;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(-1);
        lista.add(18);
        lista.add(8);
        lista.add(1);
        lista.add(5);
        lista.add(30);
        
        Collections.sort(lista);
        //Para imprimir lo del array - Forma 1
        int v = lista.get(2);
        System.out.println("R: " + lista.toString());
        lista.remove(v);
        
        System.out.println();
        
        //Para odrdenar de menor a mayor lo que este dentro de una lista.
      //  Collections.sort(lista);        
        //Para imprimir lo del array - Forma 2
        for(int i : lista){
           System.out.println("R: " + i);  
        }
        
        System.out.println();
        
        //Para imprimir lo del array - Forma 3
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        
    }
}
