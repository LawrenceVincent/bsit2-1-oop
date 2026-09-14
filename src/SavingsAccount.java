public class SavingsAccount extends Account {
    public static final double MAINTAINING_BALANCE = 500.0;
    private double interestRate;

    public SavingsAccount(String accountNumber, String ownerName,
                          double openingBalance, double interestRate) {}
    @Override
    public String getAccountType() {
        return "SAVINGS";
    }


    @Override
public void withdraw(double amount) throws InsufficientFundsException {}
}
public double monthlyInterest() {
    Object interestRate = null;
    return getBalance() * interestRate / 12;
    return 0;
}

private double getBalance() {
    return 0;
}

void main() {
}
