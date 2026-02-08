package inventory;

public class PushNut extends Nut {

    public PushNut(String name, int count, double price) {
        super(name, count, price);
    }

    @Override
    public double calculateValue() {
        return count * price;
    }
}
