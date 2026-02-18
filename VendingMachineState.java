public interface VendingMachineState {
    void selectItem (String item, double price);
    void insertCoin (double amount);
    void dispenseItem();
    void setOutOfOrder();
}