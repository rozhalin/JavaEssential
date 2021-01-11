package EX3;

public class Ship extends Vehicle{
    int passengers;
    String port;

    public Ship(int price, double speed, int year, int passengers, String port) {
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.passengers = passengers;
        this.port = port;
    }

    public void show() {
        System.out.println(this.price + this.speed + this.year + this.passengers + this.port);
    }

}
