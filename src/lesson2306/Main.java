package lesson2306;

import javax.swing.tree.TreeCellEditor;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //==================================================
        TreeSet<Girl> girls = new TreeSet<Girl>((t0, t1) -> t0.getName().compareTo(t1.getName()));
        girls.add(new Girl("Ira", 23));
        girls.add(new Girl("Kate", 32));
        girls.add(new Girl("Mira", 28));
        girls.add(new Girl("Inna", 31));

        System.out.println(girls);

        //==================================================
        //Iterator
/*        ArrayList<String> al = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        //Use iterator to display content of al
        System.out.println("Oryginal content of al = " + al);
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();


        //Modify objects being iterated
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.println("Modified content: ");
        itr = al.iterator();

        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //Now display the list backwards.
        System.out.println("Modified list backwards: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }*/


        //==================================================
        //Queue
/*        Queue<String> queue = new LinkedList<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");
        while (queue.size() > 0) {
            System.out.print(queue.remove() + " ");
        }*/

        //==================================================
        //Linked list
/*        LinkedList<String> list = new LinkedList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        System.out.println(list);
        System.out.println("Initial size of al = " + list.size());

        list.add(1, "A2");
        list.addLast( "Z");
        list.addFirst("A0");
        System.out.println("Size of al after addition = " + list.size());

        //Display arraylist
        System.out.println("al = " + list);
        System.out.println();
        //Remove elements
        list.remove("F");
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        System.out.println("al after deletion = " + list.size());
        System.out.println("Content of al after deletion = " + list);*/

        //==============================================================================
//Create arraylist
/*        ArrayList<String> al = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        System.out.println("Initial size of al = " + al.size());

        al.add(1, "A2");
        System.out.println("Size of al after addition = " + al.size());

        //Display arraylist
        System.out.println("al = " + al);
        System.out.println();
        //Remove elements
        al.remove("F");
        al.remove(2);
        System.out.println("al after deletion = " + al.size());
        System.out.println("Content of al after deletion = " + al);*/
//================================================================================
/*      ArrayList<String> list = new ArrayList<String>(){{
        add("aa");
        add("bb");
        add("cc");}};*/


//удобный вариант инициализации эррей листа
//        ArrayList<String> list = new ArrayList<String>(Arrays.asList("aa", "bb", "cc"));

//Преобразование через конструктор эррей лист в трисет
/* TreeSet<String> list = new TreeSet<String>(Arrays.asList("aa", "bb", "cc"));

        System.out.println(list);*/


    }
}

