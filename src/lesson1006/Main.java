package lesson1006;

import java.io.IOException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Formatter;
import java.util.Random;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Main {
    public static void main(String[] args) throws Exception {

        //Попробовать дома
/*        System.out.println("hi"
                .chars()
                .mapToObj(s -> (char)s + "")
                .collect(Collectors.joining("-")));*/

       /* try {
            try {
                throw new Exception("a");
            } finally {
                if (true) {
                    throw new IOException("b");
                }
                System.err.println("c");
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (Exception ex) {
            System.err.println("d");
            System.err.println(ex.getMessage());*/

/*
        asd();
        return;
*/

/*        try {
            throw new MyException("My Exception");
        } catch (MyException e) {
            e.my();
            System.out.println(e.getMessage());
        }*/

//Рандомайзер слов:
/*        Random random = new Random();
        System.out.println(random.ints(40, 60)
                .limit(10)
                .mapToObj(s -> (char) s + "")
                .collect(Collectors.joining()));*/


/*        int a;
        try {
            a = args.length;
            int b = 43/a;
            int[] c = new int [a];
            c[a] = 666;
        } catch (ArithmeticException e) {
            System.out.println("Dividing by zero:" +e);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Уже после блока try-catch-catch.");*/

/*        int a = 0, b = 0, c = 0;
         Random r = new Random();
        for (int i = 1; i <= 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль в выборке:" + i);
                a = 0;
            }
            System.out.println("a: " + a + " Попытка: " + i);

        }*/

/*        int a = 0, b = 0, c = 0;
        Random r = new Random();
        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            } catch (Exception e) {
            }
            System.out.println("Деление на 0 в итерации номер: " +  i+1);
        }
        System.out.println("a: " + a);*/


/*
        int a = 0, b = 0, c = 0;
        Random r = new Random();
        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль в итерации " + i);
            }
            System.out.println("a :" + a);
*/

/*
        int a = 10;
        int c = 0;
        try {
            c = a / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println(c);
*/



/*        String ssss = String.format("eqweqgdssd %d dsadsasdasd %s", 10, "sdass");
        System.out.println(ssss);*/

/*        Formatter f = new Formatter();
        Calendar cal = Calendar.getInstance();
        //12 hrs format
        f.format("%tr", cal);
        System.out.println(f);
        //full format date and time
        f = new Formatter();
        f.format("%tc", cal);
        System.out.println(f);
        //currect hour and min
        f = new Formatter();
        f.format("%tl:%tM", cal, cal);
        System.out.println(f);
        //different month
        f = new Formatter();
        f.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(f);*/


        }

/*    private static void asd() throws MyException {
        System.out.println("hi");
        throw new MyException("This is my Exception");
    }*/
    }


