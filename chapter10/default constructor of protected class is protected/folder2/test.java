package chapter10.folder2;
import chapter10.folder3.*;
import java.util.*;
import chapter10.folder1.*;

public class test extends Show{
    Pro generate(){
        return new Proshow();
    }

    public static void main(String[] args){
        test t = new test();
        Pro p = t.generate();
        // ((Show.Proshow)p).shoe();
        p.show();
    }
} 