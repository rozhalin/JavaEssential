package EX3;

public class Car {
    private int age;
    private double speed;
    private int weight;
    private String color;

    public Car(int age) {
        this.age = age;
    }

    public Car(int age, double speed) {
        this.age = age;
        this.speed = speed;
    }

    public Car(int age, double speed, int weight) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int age, double speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
