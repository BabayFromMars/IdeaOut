package HomeTask3;

public abstract class Human {

    boolean sex;
    String firstName, lastName;
    float higth, weigth;

       public static boolean sex(String a) {
        if (a == "man") {
            return true;
        }
        return false;
    }

    public Human(boolean sex, String firstName, String lastName, float higth, float weigth) {
        this.sex = sex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.higth = higth;
        this.weigth = weigth;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHigth() {
        return higth;
    }

    public void setHigth(float higth) {
        this.higth = higth;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (sex != human.sex) return false;
        if (Float.compare(human.higth, higth) != 0) return false;
        if (Float.compare(human.weigth, weigth) != 0) return false;
        if (!firstName.equals(human.firstName)) return false;
        return lastName.equals(human.lastName);
    }

    @Override
    public int hashCode() {
        int result = (sex ? 1 : 0);
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + (higth != +0.0f ? Float.floatToIntBits(higth) : 0);
        result = 31 * result + (weigth != +0.0f ? Float.floatToIntBits(weigth) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "sex=" + sex +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", higth=" + higth +
                ", weigth=" + weigth +
                '}';
    }

    public boolean talk(){
           return true;
    }

    public abstract boolean patience();

    public abstract boolean spendTime();

    public abstract void getRelations();

}

