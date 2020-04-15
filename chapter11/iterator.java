import java.util.*;

import org.graalvm.compiler.graph.IterableNodeType;

public class test{
    private static void display(Iterator<String> it){
        while (it.hasNext()){
            String a = it.next();
            System.out.println(a);
        }
    }
    public static void main(String[] args){
        ArrayList<String> strs = new ArrayList<>();
        Collections.addAll(strs, "a", "b", "c");

        ListIterator<String> it = strs.listIterator();
        
        while (it.hasNext()){
            it.next();
            it.add("here");
        }

        display(strs.iterator());
    }
}