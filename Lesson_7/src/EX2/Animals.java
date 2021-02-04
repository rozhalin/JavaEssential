package EX2;

public enum Animals {
    CAT(1),DOG(2),FOX(3),WOLF(4);
    int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("It is %s animal %d years old.",this.name(), age);
    }

}
