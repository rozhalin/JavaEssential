package com.company.EX2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Main.Rectangle rectangle = new Main.Rectangle(2.0D, 3.5D);
        System.out.println(rectangle.areaCalculator());
        System.out.println(rectangle.perimeterCalculator());
    }

    public static class Rectangle {
        double side1;
        double side2;

        public Rectangle(double side1, double side2) {
            this.side1 = side1;
            this.side2 = side2;
        }

        double areaCalculator() {
            return this.side1 * this.side2;
        }

        double perimeterCalculator() {
            return (this.side1 + this.side2) * 2.0D;
        }
    }
}
