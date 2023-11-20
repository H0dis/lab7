public class ContBancar {
    protected double balance;

    public ContBancar() {
        balance = 5000;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    public double getBalance() {
        return balance;
    }
}