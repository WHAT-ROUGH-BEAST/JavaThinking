import java.util.*;

public class here{
    public static void main(String[] args){
        Rodent[] a = {new Mouse(), new Gerbil()};
        for (Rodent r : a)
            r.crewl();
    }
}

class Rodent{
    public void crewl(){
        System.out.println("rodent");
    }
}

class Mouse extends Rodent{
    public void crewl(){
        System.out.println("mouse");
    }
}

class Gerbil extends Rodent{
    public void crewl(){
        System.out.println("gerbil");
    }
}