package lesson0906;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws ParseException {

/*        System.out.println("sasfsafsafasdasdsasa".chars().distinct()
                .mapToObj(s -> (char)s + "")
                .collect(Collectors.joining("_")));*/

/*        System.out.println("sasfsafsafasd45asdsasa".chars()
                .filter(s -> s == 'f' || s == 'a')
                .count());*/

/*        System.out.println("sasfsafsafasd45asdsasa".chars()
                .filter(s -> (char) s != '4' && (char) s != '5')
                .mapToObj(s -> (char) s + "")
                .collect(Collectors.joining()));*/

/*        Arrays.stream("4, -9, 16".split(","))
                .map(Integer::parseInt)
                .map(i -> (i < 0) ? -i : i)
                .forEach(System.out::println);*/

//My wrong
/*        System.out.println("1,2,3,4,5,6,7,8,9,10".chars()
                .filter(s -> (char)s%2==0)
                .mapToObj(s -> (char)s + "")
        .collect(Collectors.joining(" ")));*/

//Correct
/*
        Arrays.stream("1,2,3,4,5,6,7,8,9,10".split(","))
                .map(Integer::parseInt)
                .filter(s -> s % 2 == 0)
                .map(s -> s * 2)
                .forEach(System.out::println);
*/

/*        Random random = new Random();
        random.ints(1, 10)
                .limit(10)
                .forEach(s -> System.out.println(s));*/

/*
        Consumer<String> printUpperCase = str ->
                System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");
*/
/*        System.out.println(Pattern.compile(":")
                .splitAsStream("foobar:foo:bar")
                .filter(s -> s.contains("bar"))
                .sorted()
                .collect(Collectors.joining(":")));


        Pattern pattern = Pattern.compile(".*@gmail\\.com");
        System.out.println(Stream.of("bob@gmail.com", "alice@hotmail.com")
                .filter(pattern.asPredicate())
                .count());*/

/*      Locale current = Locale.getDefault();
        System.out.println(Locale.getDefault());
        System.out.println(new Date());
        System.out.println(current.getCountry());
        System.out.println(current.getDisplayCountry());
        System.out.println(current.getDisplayLanguage());

        System.out.println();
        Locale.setDefault(Locale.ITALIAN);
        System.out.println(Locale.getDefault());*/


  /*      NumberFormat nfGe = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);

        double iGe=0, iUs=0, iFr=0;

        String str="1.234,5";

        try{
            iGe = nfGe.parse(str).doubleValue();
            iUs = nfUs.parse(str).doubleValue();
            iFr = nfFr.parse(str).doubleValue();
        } catch (ParseException e) {
            System.err.print("Error position:" +e.getErrorOffset());
        }
        System.out.printf("Ge= %f\niUs=%f\niFr=%f", iGe, iUs, iFr);
        String sUs=nfUs.format(iGe);
        String sFr=nfFr.format(iGe);
        System.out.println("\nUs " + sUs + "\nFr " + sFr);*/

       /* DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.US);
        Date d = null;
        String str1 = "April 9, 2012";
        try {
            d = df.parse(str1);
            System.out.println(d);
        }catch (ParseException e){
            System.err.print("Error position: " + e.getErrorOffset());
        }
        df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru", "RU"));
        System.out.println(df.format(d));
        df = DateFormat.getDateInstance(DateFormat.FULL,Locale.GERMAN);
        System.out.println(df.format(d));
*/


    }
}
