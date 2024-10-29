package LinkedHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class All {
    public static void main(String[] args){
        ArrayList<String> enames1 = new ArrayList<String>();
        LinkedList<String> enames2 = new LinkedList<String>();
        HashSet<String> enames3 = new HashSet<String>();
        LinkedHashSet<String> enames4 = new LinkedHashSet<String>();
        enames3.add("Rahul");
        enames3.add("Priyanka");
        enames3.add(null);
        enames3.add("Amith");
        enames3.add("Sonia");
        enames3.add("Modi");
        enames3.add("Rahul");
        System.out.println(enames3);
        System.out.println(enames3.size());
        System.out.println(enames3.isEmpty());
        System.out.println(enames3.contains("Rahul"));

    }
}
