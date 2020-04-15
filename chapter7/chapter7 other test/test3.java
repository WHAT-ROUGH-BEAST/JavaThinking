import java.util.*;

public class test3{
    public static void main(String[] args){
        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Cycle()};
        cycles[0].c();
        cycles[1].c();
        cycles[2].c();
    }
}

class Cycle{
    public void a(){};
}

class Unicycle extends Cycle{
    public void a(){};  
    public void b(){};
}

class Bicycle extends Cycle{
    public void a(){};
    public void c(){};
}