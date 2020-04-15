import java.util.*;

public class test2{
    public static void main(String[] args){
        Starship starship = new Starship();
        starship.warning();
        starship.changeStat();
        starship.warning();
    }
}

class Starship{
    private Status status = new FineStatus();
    public void warning(){
        System.out.println(status);
    }

    public void changeStat(){
        status = new AlertStatus();
    }
}

class Status{
    public String toString(){
        return "Status";
    } 
}

class AlertStatus extends Status{
    public String toString(){
        return "AlertStatus";
    }
}

class FineStatus extends Status{
    public String toString(){
        return "FineStatus";
    }
}