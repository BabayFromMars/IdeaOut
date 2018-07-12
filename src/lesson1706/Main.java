package lesson1706;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //Create hash set
        TreeSet<String> hs = new TreeSet<String>();

        //Add elements to set

        hs.add("B");
        hs.add("A");
        hs.add("E");
        hs.add("C");
        hs.add("D");
        hs.add("F");
//        hs.add(null);

//        System.out.println(hs);

        hs.forEach(s -> System.out.println(s.hashCode()));
        System.out.println();
        for (String x: hs)
              {
                  System.out.println(x.hashCode());
        }

    }
}
