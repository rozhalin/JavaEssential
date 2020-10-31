package EX4;

public class Car {
    private int age;
    private double speed;
    private int weight;
    private String color;

    public Car() {
    }

    public Car(int age) {
        this.age = age;
        this.speed = 120.0;
        this.weight = 1430;
        this.color = "black";
    }

    public Car(double speed) {
        this(2);
    }

    public Car(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 10;
        this.speed = 200.5;
    }
}
