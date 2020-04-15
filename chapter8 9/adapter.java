import java.uitl.*;

public class test2{
    private static final String s = "here";
    public static void main(String[] args){
        StrAdapter sAdapter = new StrAdapter(new StrOperater());
        Apply.process(sAdapter, s);
    }
}

class Apply{
    public static void process(Processer p, Object s){
        System.out.println(p.name());
        System.out.println(p.process(s));
    }
}

interface Processer{
    String name();
    Object process(Object inputObject);
}

class StrOperater{
    String name(){
        return getClass().getName();
    }

    String process(String s){
        return s;
    }
}

class StrAdapter implements Processer{
    StrOperater sOperater = new StrOperater();

    StrAdapter(StrOperater sOperater){
        this.sOperater = sOperater;
    }

    public String name(){
        return sOperater.name();
    }

    public String process(Object s){
        return sOperater.process((String)s);
    }
}