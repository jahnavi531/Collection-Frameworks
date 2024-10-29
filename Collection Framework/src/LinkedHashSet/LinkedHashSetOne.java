package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.*;

public class LinkedHashSetOne {
    public static void main(String[] args) {
        LinkedHashSet<String> enames = new LinkedHashSet<String>();
        enames.add("Rahul");
        enames.add("Priyanka");
        enames.add(null);
        enames.add("Amith");
        enames.add("Sonia");
        enames.add("Modi");
        enames.add("Rahul");
        System.out.println(enames);

        //iteration for
        for(String ename: enames){
            System.out.println(ename);
        }
        //Iterator
        Iterator itr = enames.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }






    }
}
