package chapter5.access;

import java.util.*;
import static myplus.Print.*;

public class Here{
    private int a;

    public Here(){}

    public Here(int a){
        this.a = a;
    }

    protected void show(){
        System.out.println(a);
    }
}