package lesson11;

public class CarTest {
    static void changeDoor(Car car, int i){
        car.door = i;
    }

    static void changeColor(Car car1, Car car2){
        String color = car1.color;
        car1.color=car2.color;
        car2.color=color;
    }

    public static void main(String[] args) {
        Car c1 = new Car("yellow", "6L", 2);
        Car c2 = new Car("red", "4L", 5);

        changeDoor(c1,3);
        changeColor(c1, c2);

        System.out.println("car1: "+c1);
        System.out.println("---");
        System.out.println("car2: "+c2);
    }
}
