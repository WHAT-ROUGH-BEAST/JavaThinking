import java.util.*;

public class test2{
    public static void main(String[] args){
        Hero hero = new Hero();
        hero.fight();
    }
}

interface CanFight{
    void fight();
}

class Man{
    public void fight(){
        System.out.println("say");
    }
}

class Hero extends Man implements CanFight{}