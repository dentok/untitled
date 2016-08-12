package second;

/**
 * Created by Oksana on 16.02.2016.
 */
public class Second {

    static int a = B.g();

    public static int f(){

        return a+1;
    }
}

class B extends Second {
    static int b = Second.f();
    public static  int g(){

        return b+1;
    }
}

class Main {
    public static  void main (String [] args){
        System.out.println(Second.a);
        System.out.println(B.b);


    }



}