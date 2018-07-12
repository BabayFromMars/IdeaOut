package lesson1606;

public class Gen<T> {

    T ob; //declare an object of T

    Gen(T o){
        ob = o;
    }

    public T getOb() {
        return ob;
    }
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
