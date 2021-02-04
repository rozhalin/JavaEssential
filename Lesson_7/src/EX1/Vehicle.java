package EX1;

public enum Vehicle {

    ROADSTER(100),COUPE(150);

    int cost;
    String color;

    Vehicle(int cost) {
        this.cost = cost;
        this.color = "Black";
    }

    Vehicle(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Экземпляр %s, цвет %s, стоимость %d",super.toString(), this.getColor(),this.getCost() );
    }

    public String getColor() {
        return this.color;
    }

    public int getCost() {
        return cost;
    }
}
