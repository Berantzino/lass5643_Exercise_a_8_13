public class BankAccount {
    /*
    Add a transfer method to the BankAccount class from the previous exercises. Your method should move money
    from the current bank account to another account. The method accepts two parameters: a second BankAccount to
    accept the money, and a real number for the amount of money to transfer. There is a $5.00 fee for transferring
    money, so this much must be deducted from the current account’s balance before any transfer. The method should
    modify the two BankAccount objects such that “this” current object has its balance decreased by the given amount
    plus the $5 fee, and the other account's balance is increased by the given amount. If this account object does not have
    enough money to make the full transfer, transfer whatever money is left after the $5 fee is deducted. If this account
    has under $5 or the amount is 0 or less, no transfer should occur and neither account's state should be modified. The
    following are some example calls to the method:
    BankAccount ben = new BankAccount();
    ben.deposit(80.00);
    BankAccount hal = new BankAccount();
    hal.deposit(20.00);
    ben.transfer(hal, 20.00); // ben $55, hal $40 (ben -$25, hal +$20)
    ben.transfer(hal, 10.00); // ben $40, hal $50 (ben -$15, hal +$10)
    hal.transfer(ben, 60.00); // ben $85, hal $ 0 (ben +$45, hal -$50)
    */

    String name;
    double balance;
    private double transactonFee = 0.00;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {

        if (balance - (amount + transactonFee) < 0.00) {
            System.out.println("Amount must not be greater than: $" + balance + " + fee: $" + transactonFee);
        }
        else {
            balance = balance - (amount + transactonFee);
            System.out.println("$" + amount + " Has been withdrawn from your account. The transaction fee was: $" +
                                transactonFee);
        }
    }

    public void setTransactonFee(double transactonFee) {
        this.transactonFee = transactonFee;
    }

    // toString metode (Opgave 8.12)
    @Override
    public String toString() {
        return name + ", " + "$" + balance + ".";
    }

    // Transfer funds (Opgave 8.13)
    public void transferFunds(BankAccount acc, double amount) {

        double transferFee = 5.00;

        if (this.balance <= transferFee || amount <= 0.00) {
            System.out.println("You do not have funds to cover our transferfee of: $" + transferFee + ".");
        }
        else if ((this.balance - transferFee) < amount) {
            acc.balance += (this.balance - transferFee);
            this.balance = 0.00;
        }
        else {
            acc.balance += amount;
            this.balance -= (amount + transferFee);
        }
    }
}