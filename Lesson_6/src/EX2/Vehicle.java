package EX2;

public class Vehicle {

    public void print() {
        System.out.println("I am vehicle!");
    }

    public static class Wheel{

        public void print() {
            System.out.println("I am wheel and I am rollin`");
        }
    }

    public static class Door {
        public void print() {
            System.out.println("I am opening");
        }
    }
}
