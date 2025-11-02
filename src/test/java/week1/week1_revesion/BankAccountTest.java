package week1.week1_revesion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount = new BankAccount();
    private double balance;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount();
    }
//    @BeforeEach indique à JUnit que la méthode marquée avec cette annotation doit être exécutée avant chaque test (@Test).


    @Test
    void depositShouldIncreaseBalance() {
       bankAccount.deposit(100);
       assertEquals(100, bankAccount.getBalance());
    }
    @Test
    void depositNegativeShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(-50));

    }

    @Test
    void withdrawShouldDecreaseBalance() {
        bankAccount.deposit(200);
        bankAccount.withdraw(50);
        assertEquals(150, bankAccount.getBalance());
    }
    @Test
    void withdrawNegativeShouldThrowException() {
        bankAccount.deposit(100);
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(-10));
    }

    @Test
    void initialBalanceShouldBeZero() {
        assertEquals(0, bankAccount.getBalance());
    }

}