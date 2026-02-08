package inventory;

public class Bolt extends Item {

    public Bolt(String name, int count, double price) {
        super(name, count, price);
    }

    @Override
    public double calculateValue() {
        return count * price;
    }
}
