package test1;

import java.util.*;

/** a program to change rainbow color
 * @author jiang
 * @version 1.0
 */
public class test1{
    public static void main(String args[]){
        /** object */
        RainBow th = new RainBow();
        /** method */
        th.changeTheHueOfTheColor((int)10);
        System.out.println(th.anIntegerRepresentingColors+'\n');
        int a = 10;
        System.out.println(a);
    }
}

class RainBow{
    int anIntegerRepresentingColors = 0;
    public void changeTheHueOfTheColor(int newHue){
        this.anIntegerRepresentingColors = newHue;
    }
}