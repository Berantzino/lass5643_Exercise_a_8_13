public class RunBank {

    public static void main(String[] args) {

        // Test af opgave 8.11
        BankAccount minBank = new BankAccount();

        System.out.println("Current balance: $" + minBank.balance);
        minBank.deposit(500.00);
        System.out.println("Current balance: $" + minBank.balance);

        minBank.withdraw(250.00);
        System.out.println("Current balance: $" + minBank.balance);

        minBank.withdraw(300.00);

        // Test af opgave 8.12
        minBank.name = "Lasse";
        System.out.println(minBank.toString());
        System.out.println();

        // Test af opgave 8.13
        BankAccount ben = new BankAccount();
        ben.name = "Ben";
        ben.deposit(80.00);

        BankAccount hal = new BankAccount();
        hal.name = "Hal";
        hal.deposit(20.00);

        ben.transferFunds(hal, 20.00); // ben $55, hal $40 (ben -$25, hal +$20)
        System.out.println(ben.toString());
        System.out.println(hal.toString());
        System.out.println();

        ben.transferFunds(hal, 10.00); // ben $40, hal $50 (ben -$15, hal +$10)
        System.out.println(ben.toString());
        System.out.println(hal.toString());
        System.out.println();

        hal.transferFunds(ben, 60.00); // ben $85, hal $ 0 (ben +$45, hal -$50)
        System.out.println(ben.toString());
        System.out.println(hal.toString());
        System.out.println();
    }
}
