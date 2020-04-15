import java.util.*;

class A{
    public A(int a){
        System.out.println("its a lie " + a);
    }

    public void mprint(){}
}

class B{
    public A getA(int x){ // 当x只在new A（x）以及构造器中使用的时候可以不是final
        return new A(10){
            {System.out.println("then "+ x);}
        };
    } 

    public static void main(String[] args){
        B b = new B();
        A a = b.getA(100);
    }
}