package lesson2505;

public class Main {
    public static void main(String[] args) {
        String usd = "USD";
        //Enum to string
        Enum currency = Enum.valueOf(Currency.class, usd);
        System.out.println("currency = " + currency);

        //Enum to string
        currency = Currency.valueOf(usd);
        System.out.println("currency = " + currency);

                
/*        Apple ap, ap2, ap3;

        for (Apple A : Apple.values())
            System.out.println(A + " " + A.ordinal());

        ap = Apple.A;
        ap2 = Apple.B;
        ap3 = Apple.C;
        System.out.println();

        if(ap.compareTo(ap2)< 0)
            System.out.println(ap + " comes before " + ap2);

        if(ap.compareTo(ap2)> 0)
            System.out.println(ap2 + " comes before " + ap);

        if(ap.compareTo(ap3)== 0)
            System.out.println(ap + " equals " + ap3);

        if(ap.equals(ap2))
            System.out.println("Error!");*/
        //==================================================================================

/*        Apple ap;

        Apple allapples[] = Apple.values();
        for (Apple C : allapples)
            System.out.println(C);

        ap = Apple.valueOf("C");
        System.out.println("ap contains " + ap);*/
        //==================================================================================

/*        Apple ap;

        ap = Apple.RedDel;
        System.out.println("Value of ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if (ap == Apple.GoldenDel)
            System.out.println("ap contains GoldenDel.\n");

        Switch(ap){
            case Jonathan:
                System.out.println("Jonathan is red");
                break;
        }
        */

        /*       Apple a = Apple.C;
        System.out.println(a.s1);
*/
        //==================================================================================

/*
        A a = new A();
        a.m();
        new A(){
            @Override
            void m() {
                System.out.println("B");
            }
            void n(){
                System.out.println("n");
            }
        }.n();
*/

//==================================================================================

/*
        Bank a = new Bank("PrivetBank");
        Bank.Account account = a.new Account(123, 100);
        account.show();
        Bank a1 = new Bank("Mono");
        Bank.Account account1 = a1.new Account(234, 200);
        account1.show();
*/
//==================================================================================

/*        A a = new A(1);
        a.m();
        A.C c = new A.C(2);
        c.m();
        A.B b = a.new B(3);
        b.m();*/

//==================================================================================
/*        MyInterface a = new A();
        a.m();
        a = new B();
        a.m();
        */
//==================================================================================
 /*       MyInterface a = (s) -> System.out.println(s+1);
        a.m(2);
        a = (s) -> System.out.println(s+2);
        a.m(2);
        a = (s) -> System.out.println(s+3);
        a.m(2);*/

//==================================================================================

/*        class D {
      int a;
     int b;

     @Override
     public String toString() {
         return "D{" +
                 "a=" + a +
                 ", b=" + b +
                 '}';
     }

     public D(int a, int b) {
         this.a = a;
         this.b = b;
     }

 }
       D d = new D(2,3);
        System.out.println(d);*/
//==================================================================================


    }
}
