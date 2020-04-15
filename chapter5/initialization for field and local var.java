import java.java.util.*;

/**
 * 对象域以及局部变量的初始化
 */
class test{
    public static void main(String args[]){
        one o = new one();
        o.show();
    }
}

class one{
    private int a;
    private Two b;
    one(){}
    public void show(){
        String c;
        System.out.println(a);
        System.out.println(b);//引用被自动初始化null
        //!System.out.println(c);//局部变量不会自动初始化
    }
}

class Two{

}