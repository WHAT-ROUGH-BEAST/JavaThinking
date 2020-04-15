import java.util.*;

interface Use{
    static class Useful{
        static void run(Use u){
            u.speak();
        }

        void speak(){
            System.out.println("now");
        }
    }

    void speak();
}

public class test implements Use{
    public void speak(){
        System.out.println("here");
    }

    public static void main(String[] args){
        test t = new test();
        Useful.run(t);
        Useful u = new Useful();
        u.speak();
    }
}