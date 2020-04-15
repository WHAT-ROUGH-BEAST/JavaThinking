import java.util.*;

/**
 * 基类中private方法不能被重载，因此基类、导出类的同名方法其实是两个方法。
 * 至于调用谁，根据引用的类型
 */
public class test1{
    private void f(){
        System.out.println("private");
    }
    public static void main(String[] args){
        test1 t = new test2();
        t.f();
    }
}

class test2 extends test1{
    public void f(){
        System.out.println("public");
    }
}