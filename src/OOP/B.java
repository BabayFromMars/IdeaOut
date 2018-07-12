package OOP;

public class B extends A {
    static int b=100;
    @Override
    void m() {
        System.out.println("B");
    }
    {
        System.out.println("non static block B");
    }
}
