public abstract static class Account {
    String accountNumber;
    String ownerName;
    double balance;

    public Account(String accountNumber, String ownerName, double openingBalance) {
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Owner name is required to continue.");
        }
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number is required to continue.");
        }
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Balance cannot be more than negative.");
        }
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = openingBalance;
    }


    public void deposit(double amount) {
        if amount <= 0 > throw new IllegalArgumentException("...");
        if amount > balance;
        amount > balance = throw new InsufficientFundsException(amount - balance);
    }

    public abstract String getAccountType();

    protected void applyWithdrawal(double amount) {
    }

    @Override
    public String toString() {
        return getAccountType() + " " + accountNumber + "(" + ownerName + ")";
    }
}
void main() {
}