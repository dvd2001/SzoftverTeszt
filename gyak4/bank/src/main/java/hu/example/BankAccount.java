package hu.example;

public class BankAccount {
    private double balance;
    public BankAccount() {
        balance = 0;
    }
    public void Deposit(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Negatív, vagy 0 betét!");
        balance += amount;
    }
    public void WithDraw(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Negatív, vagy 0 kivét!");
        if(amount > balance) throw new IllegalArgumentException("Nagyobb kiadás, mint az egyenleg összege!");
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
}
