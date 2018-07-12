package lesson0306;

import myPack.Factorial;

import java.lang.reflect.Field;
import java.sql.SQLOutput;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Filter;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*       System.out.println(new StringBuffer("qwerty").reverse());*/

/*        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("buffer = " + sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
        System.out.println();

        StringBuffer sb1 = new StringBuffer("HelloHelloHelloHelloHello");
        System.out.println("buffer = " + sb1);
        System.out.println("length = " + sb1.length());
        System.out.println("capacity = " + sb1.capacity());
        System.out.println();

        System.out.println();
        sb.ensureCapacity(25);
        System.out.println("ensure capacity = " + sb.capacity());

        System.out.println();
        sb.setCharAt(1,'O');
        System.out.println(sb);
        sb.setLength(2);
        System.out.println(sb);

        System.out.println();
        sb1.insert(2, "like");
        System.out.println(sb1);

        sb1.delete(4, 25);
        System.out.println("sb1 = " + sb1);*/

//        System.out.println(String.join(":", "foobar", "foo", "bar"));

 //       "qwerttttyui".chars().forEach(s -> System.out.print(s + " "));


/*        Function<String, String> a = s -> s + "aaa";
        Predicate<String> b = s -> s.equals("q") || s.equals("r") || s.equals("t");
        System.out.println(a.apply("qqq"));
        System.out.println(b.test("q"));
        System.out.println("qwerttttyui".chars().
                distinct().
                mapToObj(s-> (char) s + "").
                filter(b).
                map(a).
        collect(Collectors.joining("-")));*/

Predicate<String>nullCheck = arg->arg!=null;
Predicate<String>emptyCheck = arg->arg.length()>0;
Predicate<String>nullAndEmptyCheck = nullCheck.and(emptyCheck);

        String helloStr = "hello";
        System.out.println(nullAndEmptyCheck.test(helloStr));
        String nullStr = null;
        System.out.println(nullAndEmptyCheck.test(nullStr));



    }
}
