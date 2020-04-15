package chapter10.folder1;
import java.util.*;
import chapter10.folder3.*;

public class Show{

    protected static class Proshow implements Pro{
        /**
         * 若此时不给出public的构造函数，则默认构造器的访问权限与内部类的权限一致，
         * 也就是protected, 则即使是Show的子类也不能访问构造函数（因为他至少应该是Proshow的子类）
         */
        public Proshow(){}

        public void show(){
            System.out.println("SHOW");
        }

        public void shoe(){
            System.out.println("SHOE");
        }
    }

    public static void main(String[] args){
        Proshow p = new Proshow();
        p.show();
    }
} 

