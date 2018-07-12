package lesson2406;

import myPack.Factorial;

import javax.print.attribute.EnumSyntax;
import java.util.*;

public class Main {

/*    static HashMap<String , String> girlStringHashMap = new HashMap<String, String>() {{
        Girl fff = new Girl("fff", 22);
        put("asd", "jjjjjjj");
    }};*/

enum Faculty { FFSM, MMF, FPMI, FMO, GEO}
    public static void main(String[] args) {

 //===============================================================
/*        EnumSet<Faculty> set1 = EnumSet.range(Faculty.MMF, Faculty.FMO);
        EnumSet<Faculty> set2 = EnumSet.complementOf(set1);
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);*/

 //===============================================================
/*        List<Integer> list3 = Arrays.asList(2, 4, 7, 10, 11, 45, 50, 59, 60, 66);
        System.out.println("(1) Index: " + Collections.binarySearch(list3 ,7));
        System.out.println("(2) Index: " + Collections.binarySearch(list3 ,9));
        List<String> list4 = Arrays.asList("blue", "green", "red");
        System.out.println("(1) Index: " + Collections.binarySearch(list4 ,"red"));
        System.out.println("(1) Index: " + Collections.binarySearch(list4 ,"cyan"));
        System.out.println(Collections.frequency(list4, "red"));
        list3.remove(2);
        System.out.println(list3);*/

        //===============================================================
/*        List<String> list1 = Arrays.asList("red", "green", "blue", "black");
        System.out.println("list1 = " + list1);
        Collections.sort(list1);
        System.out.println(list1);
        List<String> list2 = Arrays.asList("green", "red", "yellow", "blue");
        System.out.println("list2 = " + list2);
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);
        Collections.reverse(list2);
        System.out.println(list2);
        Collections.shuffle(list2);
        System.out.println(list2);
        Collections.fill(list2, "black");
        System.out.println(list2);
        System.out.println(Collections.disjoint(list1, list2));*/

        //===============================================================


        //Create hashmap

/*
        HashMap<String, Double> hm = new HashMap<String, Double>();

        hm.put("John Doe", new Double(3434.34));
        hm.put("Tom Smith", new Double(123.22));
        hm.put("Jane Baker", new Double(1378.00));
        hm.put("Tod Hall", new Double(99.22));
        hm.put("Ralph Smith", new Double(-19.08));

 //Get a set of the entries
        Set<Map.Entry<String, Double>> set = hm.entrySet();

 //Display the set
        for(Map.Entry<String, Double> me:set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //Deposit 1000 into John's Doe account
        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);
        System.out.println("John Doe's new balance = " + hm.get("John Doe"));
*/


 //===============================================================
       /* System.out.println(girlStringHashMap);
        System.out.println(girlStringHashMap.getOrDefault("ssss", "aaaa"));
        System.out.println(girlStringHashMap.compute("asd", (s1, s2)-> s1+"new1"));
        System.out.println(girlStringHashMap.computeIfPresent("asd1", (s1, s2)->s1+"1111"));
*/

    }
}
