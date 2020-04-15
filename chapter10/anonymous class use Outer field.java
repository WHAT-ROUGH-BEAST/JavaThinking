import java.util.*;

public class test{
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.change();
    }
}

interface Inner{
    void changefield();
    void usemethod();
}

class Outer{
    private int i = 10;
    private void mprint(){
        System.out.println("Outer");
    }

    void change(){
        /**
         * 本作用域内，i和mprint都是可以访问的
         * 则此內部类可以使用本作用域的i mprint
         */
        Inner inner = new Inner(){
            public void changefield(){
                i = 20;
                System.out.println("i = " + i);
            }

            public void usemethod(){
                mprint();
            }
        };

        inner.changefield();
        inner.usemethod();
    }
}