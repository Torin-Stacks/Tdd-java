package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void depositMoneyTest() {
        //given
        Account torinAccount = new Account();

        //action
        torinAccount.deposit(2000);

        //assert
        double balance = torinAccount.getBalance();
        assertEquals(2000, balance);


    }
    @Test
    public void depositAmountAboveZeroOnly(){
        //given
        Account torinAccount = new Account();
        //action
        torinAccount.deposit(-2000);
        //assert
        assertEquals(0, torinAccount.getBalance());
    }

    @Test
    public void withdrawAndGiveCorrectBalance(){
        Account torinAccount = new Account();
        torinAccount.deposit(5000);
        torinAccount.withdrawal(3000);
        assertEquals(2000, torinAccount.getBalance());
    }

     @Test
    public void withdrawOnlyAmountGreaterThanZero(){
         Account torinAccount = new Account();
         torinAccount.deposit(5000);
         torinAccount.withdrawal(-3000);
         assertEquals(5000, torinAccount.getBalance());
     }

    @Test
     public void withdrawOnlyAmountLesserThanBalance(){
         Account torinAccount = new Account();
         torinAccount.deposit(5000);
         torinAccount.withdrawal(6000);
         assertEquals(5000, torinAccount.getBalance());
     }


}

