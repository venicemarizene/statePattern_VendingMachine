public class ItemSelectedState implements VendingMachineState {

    private VendingMachine machine;

    public ItemSelectedState (VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem (String item, double price) {
        System.out.println("Item already selected.");
    }

    @Override
    public void insertCoin (double amount) {
        machine.addBalance(amount);
        System.out.println("Inserted: " + amount);
        System.out.println("Current balance: " + machine.getBalance());
    }

    @Override
    public void dispenseItem() {
        if (machine.getBalance() >= machine.getSelectedItemPrice()) {
            machine.setState(machine.getDispensingState());
            machine.dispenseItem();  // Delegate to DispensingState
        } else {
            System.out.println("Not enough balance.");
        }
    }

    @Override
    public void setOutOfOrder() {
        machine.setState(machine.getOutOfOrderState());
        System.out.println("Machine is now Out Of Order.");
    }
}