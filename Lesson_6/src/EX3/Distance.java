package EX3;

public class Distance {
    static double distance = 0.0;

    public void print() {
        System.out.println(String.format("Distance is %d",distance));
    }

    public Distance(double d) {
        distance = d;
    }

    public static class Converter {
        public static double toKiloMeters() {
            return distance / 1000.0;
        }

        public static double toMiles() {
            return distance / 1600;
        }
    }
}
