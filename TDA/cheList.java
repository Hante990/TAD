package TDA;

public class cheList {

    int[] a;
    int index = 0;
    int max = 0;

    //Constructures
    public cheList() {
        this(10);
//        a = new int[10];
//        max = 10;
    }

    public cheList(int max) {
        a = new int[max];
        this.max = max;
        index = 0;
    }
    
    //Metodos
    
    public void add(int value){
        if (index < max) {
            a[index++] = value;
        }else{
            System.out.println("Error");
        }
    }
    
    public void show(){
        for (int i = 0; i < index; i++) {
            System.out.println(a[i] + "");
        }
 
    }
    
    public int get(int n) {//get Obtener el valor

        if (n >= 0 && n < max) {
           return a[n];
        } else {
            System.out.println("Error");
            return 0;
        }
    }
}
