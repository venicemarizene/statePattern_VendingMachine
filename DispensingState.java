public class DispensingState implements VendingMachineState {

    private VendingMachine machine;

    public DispensingState (VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem (String item, double price) {
        System.out.println("Dispensing in progress...");
    }

    @Override
    public void insertCoin (double amount) {
        System.out.println("Please wait. Dispensing item.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Dispensing: " + machine.getSelectedItem());

        machine.resetBalance();
        machine.setSelectedItem(null, 0);

        // Automatically go back to Idle
        machine.setState(machine.getIdleState());
        System.out.println("Returning to Idle state.");
    }

    @Override
    public void setOutOfOrder() {
        machine.setState(machine.getOutOfOrderState());
        System.out.println("Machine is now Out Of Order.");
    }
}