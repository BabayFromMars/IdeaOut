package lesson1606;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] array;

    public MyClass(T[] array) {
        this.array = array;
    }


    //return min value
    public T min() {
        T v = array[0];

        for (int i = 1; i < array.length; i++)
            if (array[i].compareTo(v) < 0) v = array[i];
        return v;
    }

    @Override
    public T max() {
        T v = array[0];

        for (int i = 1; i < array.length; i++)
            if (array[i].compareTo(v) > 0) v = array[i];
        return v;
    }

}
