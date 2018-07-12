package OOP;

public class Ball {
    //статическое поле для хранения ....
    public static int count = 0;

    //метод возвращает кол-во экземпляров класса
    static int getCountInctance() {
        return count;
    }

    private String color = "none";

    public Ball(String color) {
        this.color = color;
        count++;
    }

    protected void finalize() {
        System.out.println("ASD");
        count--;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                '}';
    }
}
