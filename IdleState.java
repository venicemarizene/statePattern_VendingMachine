public class IdleState implements VendingMachineState {

    private VendingMachine machine;

    public IdleState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem (String item, double price) {
        machine.setSelectedItem(item, price);
        System.out.println("Item selected: " + item + "\nPrice: " + price);
        machine.setState(machine.getItemSelectedState());
    }

    @Override
    public void insertCoin (double amount) {
        System.out.println("Cannot insert coins. Select item first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("No item selected.");
    }

    @Override
    public void setOutOfOrder() {
        machine.setState(machine.getOutOfOrderState());
        System.out.println("Machine is now Out Of Order.");
    }
}