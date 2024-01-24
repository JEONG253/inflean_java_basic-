package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(300000);
        account.withdraw(60000);
        account.withdraw(260000);
        System.out.println("잔액 = " + account.balance);
    }
}
