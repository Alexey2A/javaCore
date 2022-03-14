package lesson11;

public class Car {
    String color;
    String engine;
    int door;

    Car(String color, String engine, int door){
        this.color=color;
        this.engine=engine;
        this.door=door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", door=" + door +
                '}';
    }
}
