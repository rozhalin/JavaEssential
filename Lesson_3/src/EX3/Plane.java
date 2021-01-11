package EX3;

public class Plane extends Vehicle {
    int height;
    int passengers;
    public Plane(int price, double speed, int year, int height, int passengers) {
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.height = height;
        this.passengers = passengers;
    }

    public void show() {
        System.out.println(this.price + this.speed + this.year + this.height + this.passengers);
    }
}
