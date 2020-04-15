import java.util.*;

interface Cycle{
    void ride();
}

interface CycleFactory{
    Cycle getCycle();
}

class Bicycle implements Cycle{
    public void ride(){
        System.out.println("Bicycle");
    }
}

class Tricycle implements Cycle{
    public void ride(){
        System.out.println("Tricycle");
    }
}

class BicycleFactory implements CycleFactory{
    public Bicycle getCycle(){
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory{
    public Tricycle getCycle(){
        return new Tricycle();
    }
}

public class test2{
    public static void RIDE(CycleFactory cycleFactory){
        cycleFactory.getCycle().ride();
    }

    public static void main(String[] args){
        RIDE(new BicycleFactory());
        RIDE(new TricycleFactory());
    }
}