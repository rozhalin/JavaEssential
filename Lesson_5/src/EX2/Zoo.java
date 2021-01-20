package EX2;

import java.util.ArrayList;

public class Zoo {

    public static ArrayList<String> animals = new ArrayList<>();
    static {
        animals.add("Крыса");
        animals.add("Кот");
        animals.add("Собака");
        animals.add("Корова");
        animals.add("Лиса");
        animals.add("Волк");
        animals.add("Тигр");
        animals.add("Пёс");
        animals.add("Ворон");
        animals.add("Грач");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
    }
}
