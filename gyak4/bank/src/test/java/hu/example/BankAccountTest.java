package hu.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    void Setup(){
        bankAccount = new BankAccount();
    }

    @Test
    void newBalance(){
        double result = bankAccount.getBalance();

        assertEquals(0, result);
    }

    @Test
    void depositWorks(){
        double result;

        bankAccount.Deposit(1000);
        result = bankAccount.getBalance();

        assertEquals(1000, result);
    }

    @Test
    void moreDepositWorks(){
        double result;

        bankAccount.Deposit(1000);
        bankAccount.Deposit(500);
        result = bankAccount.getBalance();

        assertEquals(1500, result);
    }

    @Test
    void withdrawAfterDeposit(){
        double result;

        bankAccount.Deposit(1000);
        bankAccount.WithDraw(500);
        result = bankAccount.getBalance();

        assertEquals(500, result);
    }

    @Test
    void fullBalanceWithdraw(){
        double result;

        bankAccount.Deposit(1000);
        bankAccount.WithDraw(1000);
        result = bankAccount.getBalance();

        assertEquals(0, result);
    }

    @Test
    void tooMuchWithdraw(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()->bankAccount.WithDraw(1000));
        assertEquals("Nagyobb kiadás, mint az egyenleg összege!", exception.getMessage());
    }

    @Test
    void negativeDeposit(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> bankAccount.Deposit(-1000));
        assertEquals("Negatív, vagy 0 betét!", exception.getMessage());
    }

    @Test
    void nullDeposit(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()->bankAccount.Deposit(0));
        assertEquals("Negatív, vagy 0 betét!", exception.getMessage());
    }

    @Test
    void negativeWithdraw(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()->bankAccount.WithDraw(-1000));
        assertEquals("Negatív, vagy 0 kivét!", exception.getMessage());
    }

    @Test
    void nullWithdraw(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()->bankAccount.WithDraw(0));
        assertEquals("Negatív, vagy 0 kivét!", exception.getMessage());
    }
}
