package tdd;

public class Account {

    private double balance;
    public void deposit(double amount) {
    if(amount > 0){
            balance = balance + amount;}
    }

    // public double getDeposit() {
      //  return balance;
    //}


    public void withdrawal(double amount){
        if((amount > 0 ) && (amount < balance))
        balance = balance - amount;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(int amount ) {
        balance = amount;
    }
}

