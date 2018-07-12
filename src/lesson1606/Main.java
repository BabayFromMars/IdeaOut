package lesson1606;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Girl> hs = new TreeSet<>();

        //Add elements to set

        hs.add(new Girl("kate", 21));
        hs.add(new Girl("ira", 22));
        hs.add(new Girl("lena", 18));

        hs.forEach(System.out::println);
        System.out.println();






//Обобщения


       /* String s1[] = {"as", "sdas", "ssagas", "ewre", "ttwoqihtohwqh"};

        Integer s2[] = {3, 6, 2, 8, 6};
        Girl s3[] = {new Girl("kate", 21), new Girl("ira", 22),
                new Girl("lena", 18)};
        Character s4[] = {'b', 'r', 'p', 'w'};


        MyClass<Integer> IntegerMyClass = new MyClass<>(s2);
        MyClass<Girl> GirlMyClass = new MyClass<>(s3);
        MyClass<String > StringMyClass = new MyClass<>(s1);
        MyClass<Character> CharacterMyClass = new MyClass<>(s4);

        System.out.println(StringMyClass.max());
        System.out.println(StringMyClass.min());
        System.out.println();
        System.out.println(GirlMyClass.max());
        System.out.println(GirlMyClass.min());
        System.out.println();
        System.out.println(CharacterMyClass.max());
        System.out.println(CharacterMyClass.min());
        System.out.println();
        System.out.println(IntegerMyClass.max());
        System.out.println(IntegerMyClass.min());
*/


    /*
        MyClass<Integer> iob = new MyClass<Integer>(s2);
        MyClass<Character> cob = new MyClass<Character>(s4);

        System.out.println("Max value in inums: " + iob.max());
        System.out.println("Min value in inums; " + cob.min());
*/



/*        Integer nums[] = {1, 2, 3, 4, 5};
        if (isIn(2, nums))
            System.out.println("2 is in nums");

        if(!isIn(7, nums)) System.out.println("7 is not in nums");

        System.out.println();

        String str[] = {"one", "two", "three", "four", "five"};
        if(isIn("two", str))
            System.out.println("two is in str");

        if(!isIn("seven", str))
            System.out.Lprintln("seven is not in str");*/


/*        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new
                Stats<Integer>(inums);
        double v = iob.averege();
        System.out.println("iob average is " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new
                Stats<Double>(dnums);
        Double w = dob.averege();
        System.out.println("dob average is " + w);

        Float fnums[] = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats<Float> fob = new
                Stats<Float>(fnums);
        Double x = fob.averege();
        System.out.println("fob average is " + x);*/

/*
        String strs[] = {"1.1", "2.2", "3.3", "4.4", "5.5"};
        Stats<String> strob = new
                Stats<String>(strs);
        double x = strob.averege();
        System.out.println("strob average is " + v);
*/


/*Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("value: " + v);

        System.out.println();


        Gen<String> strOb = new Gen<String>("Generics Test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("value: " + str);*/


    }
}
