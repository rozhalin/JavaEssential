package EX2;

public class Main {
    public static void main(String[] args) {
        Car lambo = new Car(1, "yellow");
        Car ferra = new Car(2);
        System.out.println(String.format("car age: %d _ car color: %s",lambo.getAge(), lambo.getColor()));
        System.out.println(String.format("car age: %d _ car color: %s",ferra.getAge(), ferra.getColor()));
    }
}
