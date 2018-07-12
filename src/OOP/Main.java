package OOP;

import java.util.Arrays;

public class Main {
    /*   public static void aMethod(byte val) {
           System.out.println("byte");
       }

       public static void aMethod(short val) {
           System.out.println("byte");
       }
   */
    static final int CONSTANT = 10;

    public static void main(String[] args) throws CloneNotSupportedException {


//-----------------------------------------------------------------------

        AI a = new AI();
        a.m();


        IA a1 = new AI();
        IA.m1();
        a1 = () -> {System.out.println("hi");};

        IA.s[1] = 100;
        System.out.println(Arrays.toString(IA.s));
        a1.m3();

//-----------------------------------------------------------------------
/*        Shape s[] = new Shape[3];
        s[0] = new Circle("black",10, 10, 5);
        s[1] = new Rectangle("yellow",10, 10, 50, 50);
        s[2] = new Circle("green",10, 10, 5);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].draw());
        }*/
//----------------------------------------------------------------------
//        System.out.println(A.b);
//        A.m1();
//        A a = new A();
//        a.m1();
//        System.out.println(a.b);
//
//        System.out.println();
//        B.m1();
//        System.out.println(B.b);
//        B b = new B();

/*        B b = new B();
        A a = new A();
        A a1 = new A();*/
/*
        Ball sd = new Ball("red");
        Ball sd1 = new Ball("red");
        System.out.println("sd = " + sd);
        System.out.println(Ball.getCountInctance());
        System.out.println(Ball.count);*/

 /*       A a = new A();
        a.m();
        a = new C();
        a.m();
        a = new B();
        a.m();
*/
        //================================
/*        byte n = 9;
        aMethod(n);*/
/*

        A a = new A(11, 23);
        A b = new A(11, 23);
        System.out.println(a);
        System.out.println(a.getClass() == A.class);
        System.out.println(a.getClass().getCanonicalName());
        System.out.println(a.getClass().getPackage());
        System.out.println("hashcode for a = " + a.hashCode());
        System.out.println("hashcode for a = " + b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(a.clone());
*/

    }
}
