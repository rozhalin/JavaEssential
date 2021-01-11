package EX3;

public class Car extends Vehicle{
    public Car(int price, double speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }
    public void show() {
        System.out.println(this.price + this.speed + this.year);
    }
}
