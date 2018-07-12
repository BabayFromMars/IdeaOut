package lesson1006;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    void my() {
        System.out.println("hi");

    }
}