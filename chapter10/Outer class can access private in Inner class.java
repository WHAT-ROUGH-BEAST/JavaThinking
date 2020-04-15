import java.util.*;

public class test{
    class Inner{
        private int a = 10;
    }

    public static void main(String[] args){
        test t = new test();
        Inner in = t.new Inner();
        System.out.println(in.a);
    }
}