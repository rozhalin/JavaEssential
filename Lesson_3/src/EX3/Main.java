package EX3;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(1,2.0,3,4,5);
        Ship ship = new Ship(5,6.0,7,8,"Tortuga");
        Car car = new Car(9,8.0,7);
        plane.show();
        ship.show();
        car.show();
    }
}
