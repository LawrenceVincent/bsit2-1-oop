public abstract class Payment {
    private final int id; // given to you - do not change
    private final String payerName;
    private final double amount;
    public Payment(int id, String payerName, double amount) {
        this.id = id;
        this.payerName = payerName;
        this.amount = amount;
    }
    public int getId() { return id; }
    public String getPayerName() { return payerName; }
    public double getAmount() { return amount;
    }
    public double serviceFee() {
        return amount * 0.02;
    }
    public void printReceipt() {
// your printf line goes here
        pay();
    }

    public abstract String provider();

    private void pay() {
    }

    // Already written for you. Most children will simply inherit this.
    public void printThankYou() {
        System.out.println("Thank you for your payment.");
    }

    public abstract void pay();
}