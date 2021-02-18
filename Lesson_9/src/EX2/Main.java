package EX2;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Sams",15.00f, "sad212314asd");
        Monitor monique = new Monitor("sams",15.00f,"sad212314asd",2131231,12312312);
        Device device1 = new Device("Sams",15.00f, "sad212314asd");
        System.out.println(device.hashCode());
        System.out.println(monique.hashCode());
        System.out.println(device.equals(monique));
        System.out.println(device.equals(device1));
    }
}
