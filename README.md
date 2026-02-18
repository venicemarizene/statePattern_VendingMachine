# State Pattern - Vending Machine

<b>Problem:</b>
A vending machine needs to manage different states, including "Idle", "ItemSelected", "Dispensing", and "OutOfOrder". Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.

<b>Requirements:</b>

<b>1. Idle State:</b>
<ul class="indented">
  <li>Allow item selection.</li>
  <li>Disallow dispensing items and inserting coins.</li>
</ul>

<b>2. ItemSelected State:</b>
<ul class="indented">
  <li>Allow inserting coins and dispensing items.</li>
  <li>Disallow item selection.</li>
</ul>

<b>3. Dispensing State:</b>
<ul class="indented">
  <li>Allow no operations.</li>
  <li>Automatically transition back to the "Idle" state after dispensing is complete.</li>
</ul>

<b>4. OutOfOrder State:</b>
<ul class="indented">
  <li>Disallow all operations.</li>
</ul>

<b>Current System:</b> The system currently relies on conditional statements within the VendingMachine class to check the machine state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

<b>Implement the State Pattern to improve code maintainability and flexibility:</b>
<b>1. Define VendingMachine States:</b>
<ul class="indented">
  <li>Create separate classes representing different machine states: IdleState, ItemSelectedState, DispensingState, and OutOfOrderState.</li>
</ul>

<b>2. Implement State Interface:</b>
<ul class="indented">
  <li>Define an interface VendingMachineState with methods for common actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder.</li>
</ul>

<b>3. Implement State Behaviors:</b>
<ul class="indented">
  <li>Each concrete state class implements the VendingMachineState interface, providing specific behavior for its respective state. For example, the IdleState class would allow item selection, while the OutOfOrderState wouldn't allow any operations.</li>
</ul>

<b>4. Update VendingMachine Class:</b>
<ul class="indented">
  <li>Include attributes for item inventory and balance.</li>
    <li>Remove state-specific logic from the VendingMachine class.</li>
  <li>Introduce a reference to the current VendingMachineState object.</li>
  <li>Delegate actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder to the current state object through its corresponding methods.</li>
</ul>


# UML Class Diagram
![UML Class Diagram](StatePattern.png)
