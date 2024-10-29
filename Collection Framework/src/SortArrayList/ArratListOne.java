package SortArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArratListOne {
        public static void main(String[] args) {
            ArrayList<String> enames = new ArrayList<String>();
            enames.add("Rahul");
            enames.add("Sonia");
            enames.add("Priyanka");
            enames.add("Amith");

            //Iterate ArrayList  - for loop
            for(int i=0;i<=enames.size()-1;i++){
                System.out.println(enames.get(i));
            }
            //Iterate using while loop
            int i=0;
            while(i<=enames.size()-1){

                System.out.println(enames.get(i));
                i++;
            }
            //Iterate using do while loop
            int j =0;
            do{
                System.out.println(enames.get(j));
                j++;
            }
            while(i<=enames.size()-1);
            //Iterate using for Each
            for (String ename:enames) {
                System.out.println(ename);
            }
            //Sort ArrayList Order
            //how to sort - using utility class is Array, Collections
            System.out.println(enames);
            Collections.sort(enames,Collections.reverseOrder());
            System.out.println(enames);



        }

    }

