

public class AccountTest {
    public static void main(String[] args) throws Exception {
        Account account1 = new Account(1122, 20000);
        account1.setAnnualInterestRate(4.5);
        account1.setBalance(account1.withdraw(2500));
        account1.setBalance(account1.deposit(3000));
        System.out.println("Account Id: " + account1.getId() + "\nBalance: " + account1.getBalance() +
                            "\nMonthly interest: " + account1.getMonthlyInterest() + "\nDate Created: " + account1.getDateCreated());
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

    public double withdraw(double withdrawAmmount) {
        return balance - withdrawAmmount;
    }

    public double deposit(double depositAmmount) {
        return balance + depositAmmount;
    }
}