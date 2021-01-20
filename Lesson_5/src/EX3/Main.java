package EX3;

import EX2.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.animals.remove(3);
        zoo.animals.remove(5);
        zoo.animals.remove(7);

        int size = zoo.animals.size();
        System.out.println(size);
    }
}
