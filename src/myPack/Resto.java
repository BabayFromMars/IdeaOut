package myPack;

public class Resto {
    private final String restoName;

    public Resto (String restoName) {
        this.restoName = restoName;
    }

    @Override
    public String toString() {
        return "Resto{" +
                "restoName='" + restoName + '\'' +
                '}';
    }

}
