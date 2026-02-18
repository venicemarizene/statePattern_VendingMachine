public class Main {
    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine();

        machine.selectItem("Coke", 20);
        machine.insertCoin(10);
        machine.insertCoin(10);
        machine.dispenseItem();

        System.out.println();

        machine.setOutOfOrder();
        machine.selectItem("Pepsi", 25);
    }
}
