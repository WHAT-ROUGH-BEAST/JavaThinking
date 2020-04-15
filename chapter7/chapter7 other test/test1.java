import java.util.*;

public class test1{
    public static void main(String[] args){

    }
}

class Share{
    private int refcount = 0;
    private static long counter = 0;
    public final int id = counter++;
    public Share(){
        refcount ++;
    }

    public void dispose(){
        System.out.println();
    }
}