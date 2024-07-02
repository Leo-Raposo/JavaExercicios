package ex05;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static List<BankAccount> accounts = new ArrayList<>();

    public static BankAccount openAccount(String accountNumber, String accountHolder, double initialBalance) {
        BankAccount newAccount = new BankAccount(accountNumber, accountHolder, initialBalance);
        accounts.add(newAccount);
        return newAccount;
    }

    public static boolean closeAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                return true;
            }
        }
        return false;
    }

    public static boolean deposit(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return true;
            }
        }
        return false;
    }

    public static boolean withdraw(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account.withdraw(amount);
            }
        }
        return false;
    }

    public static boolean transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        BankAccount fromAccount = null;
        BankAccount toAccount = null;

        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(fromAccountNumber)) {
                fromAccount = account;
            }
            if (account.getAccountNumber().equals(toAccountNumber)) {
                toAccount = account;
            }
        }

        if (fromAccount != null && toAccount != null && fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
            return true;
        }
        return false;
    }

    public static void listAccounts() {
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}

