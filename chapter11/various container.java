import java.util.*;

/**
 * 各种的collection容器有不同的规则
 */
public class test{
    public static void main(String[] args){
        String[] s = new String[10];
        ArrayList<String> als = new ArrayList<>();
        LinkedList<String> lls = new LinkedList<>();
        HashSet<String> hss = new HashSet<>();
        LinkedHashSet<String> lhms = new LinkedHashSet<>();
        TreeSet<String> tss = new TreeSet<>();

        for (int i=0; i< 10; i++){
            String name = Generator.next();
            s[i] = name;
            als.add(name);
            lls.add(name);
            hss.add(name);
            lhms.add(name);
            tss.add(name);
        }
        
        System.out.println(als);
        System.out.println(lls);
        System.out.println(hss);
        System.out.println(lhms);
        System.out.println(tss);
    }
}

class Generator{
    private static int index = 0;
    private static String[] names = new String[]{"mission", "jason", "bourne", "maid", "smash"};
    
    public static String next(){
        index++;
        index = index % names.length;
        return names[index];
    }
}