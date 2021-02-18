package EX1;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal(2,"Pusha",true);
        Animal dog = new Animal(3,"Charlie",true);
        Animal cat2 = new Animal(2,"Pusha",true);

        System.out.println(cat.toString());
        System.out.println(dog.hashCode());
        System.out.println(cat.equals(cat2));
        System.out.println(cat.equals(dog));
    }
}
