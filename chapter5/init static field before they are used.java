import java.java.util.*;

/**
 * 静态变量在使用前（调用构造器之前）完成初始化
 */
class test{
    public static void main(String args[]){
        Fun.show();
    }
}

class Fun{
    static String a;
    static String b = "b";
    static{
        a = new String("a");
    }
    static void show(){
        System.out.println(a + " " + b);
    }
}