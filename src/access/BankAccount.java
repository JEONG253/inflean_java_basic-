package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    // public 메서드
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance -amount >=0) {
            balance -= amount;
            System.out.println(amount + "원 출금하여 잔액 : " + balance);
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드
    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야 한다.
        return amount > 0;
    }
}

