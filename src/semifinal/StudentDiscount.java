package semifinal;

public interface StudentDiscount {
    abstract discountedFare{ }

    default void printDiscount() {
        System.out.printf(" Student fare : PHP %.2fn%", discountedFare());
    }
}