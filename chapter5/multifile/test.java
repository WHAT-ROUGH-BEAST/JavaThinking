import chapter5.access.*;
import java.util.*;

class test{
    public static void main(String[] args){
        HerePlus a = new HerePlus(2);
        

        // x.show();
    }
}

class HerePlus extends Here{
    public HerePlus(int a){
        super(a);
    }

    public void show(){ super.show(); }
}