package PaymentDemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Transaction {
    static Map<Integer, User> allUsers = new HashMap<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the Type of Transaction");
        System.out.println("1 - Create a User");
        System.out.println("2 - Get Account Balance");
        System.out.println("3 - Deposit");
        System.out.println("4 - Get Statement");
        System.out.println("5 - Withdraw");

        do {


            User user;
            int n = scanner.nextInt();
            int phone;
            switch (n) {
                case 1:
                    System.out.println("Enter Your Name");
                    String name = scanner.next();
                    System.out.println("Enter Your Phone Number");
                    phone = scanner1.nextInt();
                    user = new User(phone, name);
                    allUsers.put(phone, user);
                    System.out.println("Account Created Successfully");
                    break;
                case 2:
                    System.out.println("Enter Your Phone Number");
                    phone = scanner1.nextInt();
                    user = allUsers.get(phone);
                    System.out.println("THE ACCOUNT BALANCE IS " + user.getAccountBalance());
                    break;
                case 3:
                    System.out.println("Enter Your Phone Number");
                    phone = scanner1.nextInt();
                    if(allUsers.containsKey(phone)) {
                        System.out.println("ENTER THE Amount to deposit");
                        double amount = scanner1.nextDouble();
                        System.out.println("ENTER THE Description to deposit");
                        String desc = scanner.next();
                        user = allUsers.get(phone);
                        System.out.println("DEPOSITING INTO " + user.userName);
                        user.deposit(amount, desc);
                        allUsers.put(phone, user);
                        System.out.println("Deposited Successfully");
                    } else {
                        System.out.println("Account Does not Exists");
                    }

                    break;
                case 4:
                    System.out.println("Enter Your Phone Number");
                    phone = scanner1.nextInt();
                    if(allUsers.containsKey(phone)) {
                        System.out.println("Getting Account Statement");
                        user = allUsers.get(phone);
                        List<AccountStatement> statement = user.getAccountStatements();
                        System.out.println("S:No---Description--------------------TransDate----Amount---type");
                        for(int i = 0; i< statement.size();i++) {
                            System.out.println(i+1 + "---" + statement.get(i).description + "--------------------" + statement.get(i).transactionDate + "----" + statement.get(i).amount + "---" + statement.get(i).transactionType);
                        }
                    } else {
                        System.out.println("Account Does Not Exists");
                    }
                case 5:
                    System.out.println("Enter Your Phone Number");
                    phone = scanner1.nextInt();
                    String withDrawResponse = "ERROR!";
                    if(allUsers.containsKey(phone)) {
                        System.out.println("Enter the amount to withdraw");
                        double amount = scanner1.nextDouble();
                        System.out.println("ENTER THE Description to withdraw");
                        String desc = scanner.next();
                        user = allUsers.get(phone);
                        System.out.println("Withdrawing From " + user.userName);
                        withDrawResponse = user.withdrawAmount(amount, desc);
                        allUsers.put(phone, user);
                        System.out.println(withDrawResponse);
                    } else {
                        System.out.println("Account Does Not Exists");
                    }
                    break;

                default:
                    System.out.println("INVALID");
            }
            System.out.println("Enter the Type of Transaction");
            System.out.println("1 - Create a User");
            System.out.println("2 - Get Account Balance");
            System.out.println("3 - Deposit");
            System.out.println("4 - Get Statement");
            System.out.println("5 - Withdraw");

        }while (scanner.hasNext());
    }
}
