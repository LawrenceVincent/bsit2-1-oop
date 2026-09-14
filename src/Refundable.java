public interface Refundable {

    String provider();

    void pay();

    String refund();

    default void printRefundNotice() {
        System.out.println("   " + refund());
    }
}