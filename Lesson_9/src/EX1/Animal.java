package EX1;

import java.util.Objects;

public class Animal {

    private int age;
    private String name;
    private boolean tail;

    public Animal(int age, String name, boolean tail) {
        this.age = age;
        this.name = name;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return String.format("Имя %s, возраст: %d, хвост: %s",name, age, tail? "да" : "нет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (int)age;
        result = 37 * result + (name == null ? 0 : name.hashCode());
        result = 37 * result + (tail ? 1 : 0);

        return result;
    }
}
