import java.util.*;

/**
 * 重载——override 是指参数列表不一样的同名函数
 * java中继承类的重载不屏蔽基类的同名函数
 */
public class test{
    public static void main(String[] args){
        There a = new There();
        a.show(12);
        a.show(12.0);
        a.show("here");
        a.show(new String[2]);
    }
}

class Here{
    public Here(){}

    public void show(int i){
        System.out.println("int");
    }

    public void show(String a){
        System.out.println("String");
    }

    public void show(double a){
        System.out.println("double");
    }
}

class There extends Here{
    public void show(String[] a){
        System.out.println("String[]");
    }
}