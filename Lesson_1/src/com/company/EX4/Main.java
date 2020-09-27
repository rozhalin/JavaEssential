package com.company.EX4;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Main.Computer[] computers = new Main.Computer[5];

        for(int i = 0; i < 5; ++i) {
            computers[i] = new Main.Computer();
        }

        System.out.println(computers.toString());
    }

    public static class Computer {
        public Computer() {
        }
    }
}
