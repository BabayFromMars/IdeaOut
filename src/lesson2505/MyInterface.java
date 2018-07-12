package lesson2505;

public interface MyInterface {
    int a = 10;
    void m(int a);
    default void m1(){};
    default void m2(){};
    default void m3(){};
    default void m4(){};
}
