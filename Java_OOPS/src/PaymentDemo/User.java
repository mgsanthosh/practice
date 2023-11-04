package PaymentDemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class User {
    int userId;
    String userName;
    BankAccount bankAccount;
    List<AccountStatement> accountStatements = new ArrayList<>();

    User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        createBankAccount();
    }

    public void createBankAccount() {
        bankAccount = new BankAccount();
        bankAccount.setUserId(this.userId);
        bankAccount.setAccountBalance(0);
    }

    public boolean deposit(double amount, String description) {
//        bankAccount = new BankAccount();
        bankAccount.setUserId(this.userId);
        bankAccount.setAccountBalance(bankAccount.getAccountBalance() + amount);
        AccountStatement accountStatement = new AccountStatement();
        accountStatement.amount = amount;
        accountStatement.description = description;
        accountStatement.transactionDate = new Date();
        accountStatement.transactionType = "CREDIT";
        accountStatements.add(accountStatement);
        return true;
    }

    public List<AccountStatement> getAccountStatements () {
        return  accountStatements;
    }

    public String withdrawAmount(double amount, String description) {
        double balance = getAccountBalance();
        if(balance >= amount) {
            bankAccount.accountBalance = bankAccount.accountBalance - amount;
            AccountStatement accountStatement = new AccountStatement();
            accountStatement.amount = amount;
            accountStatement.description = description;
            accountStatement.transactionDate = new Date();
            accountStatement.transactionType = "DEBIT";
            accountStatements.add(accountStatement);
            String res = "Amount " + amount + " WAS WITHDRAWN SUCCESSFULLY";
            return res;
        } else {
            return "INSUFFICIENT BALANCE";
        }
    }

    public double getAccountBalance() {
        return bankAccount.accountBalance;
    }

}
