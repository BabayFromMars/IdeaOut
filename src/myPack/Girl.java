package myPack;

public class Girl {
    private  String name;
    private  int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean presentGift(Box gift) {
        if (gift.volume() > 500)
            return true;
        return false;
    }

    public String goToResto(Resto restoName) {
        if ("Mac".equals(restoName)) {
            return "Yes";
        }
        return "No";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Go to Mac");
    }
}