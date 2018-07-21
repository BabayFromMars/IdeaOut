package july14;

public class Employee {
    int id;
    String name;
     String       city;
     int age;
    double comm;


    public Employee(int id, String name, String city, int age, double comm) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
        this.comm = comm;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", comm=" + comm +
                '}';
    }
}
