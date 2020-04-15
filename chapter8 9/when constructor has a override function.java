/**
 * 当导出类构造时，会先调用基类的构造器；
 * 基类构造器中调用的方法如果被导出类重写，则调用重写后的方法；
 * 调用该方法时，如果重写的方法使用导出类中的变量，则此时是默认初始值（0、null...）
 * 由于可能的混乱，因此建议在构造器中调用的方法为private或final方法
 */
import java.util.*;

public class test{
    public static void main(String[] args){
        PrintPlus plus = new PrintPlus();
        // plus.print();
    }
}

abstract class Print{
    abstract void print();

    public Print(){
        print();
    }
}

class PrintPlus extends Print{
    private int a = 10;

    public PrintPlus(){}

    void print(){
        System.out.println(a);
    }
}