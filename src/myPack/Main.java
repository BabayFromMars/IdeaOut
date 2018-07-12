package myPack;

public class Main {

    //Метод, который принимает любое количество параметров а и считает среднее значение
/*
    static double avg(int ... a) {
        double sum  = 0;
        for (int i : a) {
            sum+=i;
        }
        return sum/ a.length;
    }
*/

    static void m() {
        System.out.println("m()");
    }

    static void m(int a) {
        System.out.println("m(int a)");
    }

    static void m(int a, int b) {
        System.out.println("m(int a, int b)");
    }

    static void m(double a) {
        System.out.println("m(double a)");
    }

    static int m(int... a) {
        System.out.println("m(int...a)");
        return 1;
    }

    public static void main(String[] args) {


//        System.out.println(avg(1,2,3,4,5,6,7,8,9,0,323) );

//===================================================================/
        //Aspirant and Student

//        System.out.println(new Aspirant("Kate", 34, "Inheritance"));


//===================================================================/
        //Recursion

   /*     Factorial f = new Factorial();
        System.out.println("Factorial of 3 is: " + f.fact(3));
        System.out.println("Factorial of 4 is: " + f.fact(4));
        System.out.println("Factorial of 5 is: " + f.fact(5));
*/
   //===================================================================/
  /*      Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);
        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));*/

   /*     Test ob = new Test(15, 20);
        int x = 10;
        int y = 10;
        ob.meth(x,y);
        System.out.println("x and y before call: " + x + " " + y);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
*/

/*        Test ob1 = new Test(2);
        Test ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a = " + ob1.a);
        System.out.println("ob2.a = " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase = " + ob2.a);*/
// /===================================================================
//Полиморфизм
/*        m();
        m(11.2);
        m(11, 2);*/

//================================GIRLS================================

/*        Girl Kate = new Girl("Kate", 23);
        System.out.println(Kate);
        System.out.println(Kate.presentGift(new Box(12, 12, 12)));

        System.out.println(Kate.goToResto(new Resto("Mac")));

        Girl ira = new Girl("ira", 25);
        System.out.println(ira);
        ira = null;
        System.gc();*/

        //       new Girl().goToCinema();
        //       System.out.println(Girl);


//================================BOXES=================================
 /*       Box myBox = new Box(10, 20,15);
        Box myBox2 = new Box(3, 6, 9);
//        double vol;
//        myBox.depth = 15;
//        myBox.height = 20;
//        myBox.width = 10;
//
//        myBox2.depth = 25;
//        myBox2.height = 30;
//        myBox2.width = 10;

//        vol = myBox.depth * myBox.height * myBox.width;
//        System.out.println("Volume = " + vol);

double vol1 = myBox.volume();
double vol2 = myBox2.volume();

        System.out.println("myBox Volume = " + vol1);
        System.out.println("myBox2 Volume = " + vol2);*/


    }
}
