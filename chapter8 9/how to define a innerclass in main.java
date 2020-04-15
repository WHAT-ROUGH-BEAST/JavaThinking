import java.util.*;

public class test3{
    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.showstring(); 
    }
}

class Outer{
    private String s = "here";

    class Inner{
        void showstring(){
            System.out.println(s);
        }
    }
}