
package TDA;

import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
     	cheList var = new cheList();
        Scanner lee = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            var.add(i + 1);
        }
        
        var.show();
        
        System.out.println("Ingrese el indice n: ");
        int n = lee.nextInt();
        int value = var.get(n);
        
        System.out.println("El dato del indice n es: " + n + " y vale " + value);
    }  
}
