package lesson0206;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
/*
        System.out.println(" 100  ml ".trim());
        System.out.println(Arrays.toString(" 100  ml ".split("\\s+")));
        System.out.println("100  ml ".split("\\s+")[0]);
        System.out.println((100 + "").equals("100  ml ".trim().split("\\s+")[0]));
*/

/*        int i = Integer.parseInt("100");
        System.out.println(i+10);
        Integer integer = new Integer("100");
        System.out.println("(integer+20) = " + (integer+20));*/

/*
        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s = new String(chars, 2, 3);
        System.out.println(s);
        System.out.println("123".length());
*/

/*        Girl Kate = new Girl("Kate", 23);
        Girl Inna = new Girl("Inna", 18);
        Girl Lera = new Girl("Lera", 30);
        System.out.println(Kate.equals(Inna));

        TreeSet<Girl>girls = new TreeSet<>();
        girls.add(Kate);
        girls.add(Inna);
        girls.add(Lera);
        System.out.println(girls);*/

/*        System.out.println("weweq,qqewqeqw,asdasdasd,".chars()
        .mapToObj(s-> (char)s + "")
        .filter(s->s.equals(","))
        .count());

        System.out.println("weweq,qqewqeqw,asdasdasd,".chars()
        .filter(s -> s ==',')
        .count());*/

/*        String s = "This is a demo of the gtChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);*/

/*        String s = new String("Hello");
        String s1 = new String("hello");
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));*/

/*        System.out.println("Foobar".endsWith("bar"));
        System.out.println("Foobar".startsWith("Fo"));*/

/*        String str1 = new String("Hello, how are you");
        String str2 = new String("How");
        String str3 = new String("HOW");
        System.out.print("Result of Test1: ");
        System.out.println(str1.regionMatches(7, str2, 0, 3));

        System.out.print("Result of Test2: ");
        System.out.println(str1.regionMatches(7, str3, 0, 3));

        System.out.print("Result of Test3: ");
        System.out.println(str1.regionMatches(true, 7, str2, 0, 3));*/

/*        String str1 = new String("quick brown fox jumps over the lazy dog");
        System.out.print("Substring starts from index 15: ");
        System.out.println(str1.substring(15));
        System.out.print("Substring starts from index 15 and ending at 20: ");
        System.out.println(str1.substring(15, 20));*/

/*        String str1 = new String("the quick brown fox jumps over the lazy dog");
        System.out.println("str1.indexOf('j') = " + str1.indexOf('j'));
        System.out.println("str1.lastIndexOf('t') = " + str1.lastIndexOf('t'));
        System.out.println("str1.lastIndexOf('fox') = " + str1.lastIndexOf("fox"));
        System.out.println("str1.lastIndexOf('t') = " + str1.lastIndexOf('t',26));*/

/*        int i = Integer.parseInt("kitty123".replaceAll("[\\D]", ""));
        System.out.println(i);*/

    }
}
