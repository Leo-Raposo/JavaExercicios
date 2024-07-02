package ex05;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = Bank.openAccount("12345", "John Doe", 1000.0);
        BankAccount account2 = Bank.openAccount("67890", "Jane Smith", 500.0);

        Bank.deposit("12345", 200.0);

        Bank.withdraw("67890", 100.0);

        Bank.transfer("12345", "67890", 150.0);

        Bank.listAccounts();

        Bank.closeAccount("12345");

        Bank.listAccounts();
    }
}
