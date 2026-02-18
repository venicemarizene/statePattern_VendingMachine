public class VendingMachine {

    private VendingMachineState currentState;
    private double balance;
    private String selectedItem;
    private double selectedItemPrice;

    private final VendingMachineState idleState;
    private final VendingMachineState itemSelectedState;
    private final VendingMachineState dispensingState;
    private final VendingMachineState outOfOrderState;

    public VendingMachine() {
        idleState = new IdleState(this);
        itemSelectedState = new ItemSelectedState(this);
        dispensingState = new DispensingState(this);
        outOfOrderState = new OutOfOrderState(this);

        currentState = idleState;
        balance = 0;
    }

    public void selectItem (String item, double price) {
        currentState.selectItem (item, price);
    }

    public void insertCoin (double amount) {
        currentState.insertCoin(amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public void setOutOfOrder() {
        currentState.setOutOfOrder();
    }

    public void setState (VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getIdleState() {
        return idleState;
    }

    public VendingMachineState getItemSelectedState() {
        return itemSelectedState;
    }

    public VendingMachineState getDispensingState() {
        return dispensingState;
    }

    public VendingMachineState getOutOfOrderState() {
        return outOfOrderState;
    }

    public void setSelectedItem (String item, double price) {
        this.selectedItem = item;
        this.selectedItemPrice = price;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public double getSelectedItemPrice() {
        return selectedItemPrice;
    }

    public void addBalance (double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void resetBalance(){
        balance = 0;
    }
}