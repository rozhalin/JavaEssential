package EX2;

public class Car {
    private int age;
    private String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(int age) {
        this.age = age;
        this.color = "red";
    }

    public Car(int age, String color) {
        this.age = age;
        this.color = color;
    }
}
