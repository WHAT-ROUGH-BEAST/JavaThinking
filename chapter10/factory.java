import java.uitl.*;

interface Cycle{
    void ride();
}

interface CycleFactory{
    Cycle getCycle();
}

class Bicycle implements Cycle{
    private Bicycle(){}

    public void ride(){
        System.out.println("Bicycle");
    }

    static CycleFactory cycleFactory = new CycleFactory(){
        public Cycle getCycle(){
            return new Bicycle();
        }
    };
}

class Tricycle implements Cycle{
    private Tricycle(){}

    public void ride(){
        System.out.println("Tricycle");
    }

    static CycleFactory cycleFactory = new CycleFactory(){
        public Cycle getCycle(){
            return new Tricycle();
        }
    };
}

public class test{
    static void FUNC(CycleFactory factory){
        Cycle c = factory.getCycle();
        c.ride();
    }
    public static void main(String[] args){
        FUNC(Tricycle.cycleFactory);
    }
}