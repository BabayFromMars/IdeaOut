package OOP;

public class Diamond implements Interf1, Interf2 {

    @Override
    public void foo() {
        Interf2.super.foo();
    }
}
