package july14;

public class Customers {
int Cnum;
    String name;
    String city;
    int rating;
    int num;

    public Customers(int cnum, String name, String city, int rating, int num) {
        Cnum = cnum;
        this.name = name;
        this.city = city;
        this.rating = rating;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "Cnum=" + Cnum +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", rating=" + rating +
                ", Snum=" + num +
                '}';
    }
}
