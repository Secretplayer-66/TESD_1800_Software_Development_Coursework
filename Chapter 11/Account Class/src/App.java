

public class App {
    public static void main(String[] args) throws Exception {
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        Account account = new Account();
        System.out.println(account.toString());
        System.out.println(savingsAccount.toString());
        System.out.println(checkingAccount.toString());
    }
}

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
    }

    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12) / 100;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public double withdraw() {
        return balance;
    }

    public double deposit() {
        return balance;
    }
}