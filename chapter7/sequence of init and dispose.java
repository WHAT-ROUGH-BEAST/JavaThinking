import java.util.*;

public class test{
    public static void main(String[] args){
        Stem s = new Stem();

        s.dispose();
    }
}

class Root{
    private Component1 c1 = new Component1();
    private Component2 c2 = new Component2();
    private Component3 c3 = new Component3();

    public Root(){
        System.out.println("Root init");
    }

    public void dispose(){
        System.out.println("Root dispose");
        
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
}

class Stem extends Root{
    public Stem(){
        System.out.println("Stem init");
    }

    public void dispose(){
        System.out.println("Stem dispose");

        super.dispose();
    }
}

class Component{
    public Component(int i){
        System.out.println("component num" + i);
    }

    public void dispose(){
        System.out.println("Component dispose");
    }
}

class Component1 extends Component{
    public Component1(){
        super(1);
    }

    public void dispose(){
        System.out.println("Component1 dispose");
        super.dispose();
    }
}

class Component2 extends Component{
    public Component2(){
        super(2);
    }

    public void dispose(){
        System.out.println("Component2 dispose");
        super.dispose();
    }
}

class Component3 extends Component{
    public Component3(){
        super(3);
    }

    public void dispose(){
        System.out.println("Component3 dispose");
        super.dispose();
    }
}