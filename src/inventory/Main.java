package inventory;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Item pushNut = new PushNut("PushNut", 10, 1);
        Item outerNut = new OuterNut("OuterNut", 10, 1);
        Item bolt = new Bolt("Bolt", 10, 2);

        inventory.addItem(pushNut);
        inventory.addItem(outerNut);
        inventory.addItem(bolt);

        inventory.requestItem("PushNut", 5);
        inventory.requestItem("Bolt", 6);

        System.out.println("Net worth: " + inventory.calculateNetWorth());
        System.out.println("Most expensive item: " +
                inventory.getMostExpensiveItem().getName());
    }
}
