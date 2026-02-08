package inventory;

public class OuterNut extends Nut {

    public OuterNut(String name, int count, double price) {
        super(name, count, price);
    }

    @Override
    public double calculateValue() {
        return count * price;
    }
}
