package week1.week1_revesion;

public class BankAccount {
    private double balance;

    void deposit(double amount) {
        if (amount <= 0){
            throw new IllegalArgumentException("deposit amount must be positive") ;
        }
        balance += amount;
    }

    void withdraw(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("whitdraw amount must be positive");
        }
        if(amount > balance) {
           throw new IllegalArgumentException("Insufficient funds");
        }

        balance -= amount;
    }

    double getBalance() {
        return balance;
    }

}
