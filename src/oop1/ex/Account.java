package oop1.ex;

public class Account {
    int balance; // 잔액

    // 입금
    void deposit(int amount) {
        balance+= amount;
        System.out.println(amount + "원 입금되었습니다.");

    }

    // 출금
    void withdraw(int amount) {

        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
        } else {
            System.out.println(amount +"원 출금하였습니다.");
            balance -= amount;
        }

    }
}
