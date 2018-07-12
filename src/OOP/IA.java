package OOP;

public interface IA extends IC, IB {
    int a = 10;
    int[] s = {1, 2, 3};
    static void m1() {
        System.out.println("hi");
    }

   // void m2();


    default void m3() {
        System.out.println("hi from interface");
    }
}
