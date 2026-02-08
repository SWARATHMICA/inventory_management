package inventory;

public abstract class Item {

    protected String name;
    protected int count;
    protected double price;

    public Item(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public void reduceCount(int quantity) {
        this.count -= quantity;
    }

    public abstract double calculateValue();
}
