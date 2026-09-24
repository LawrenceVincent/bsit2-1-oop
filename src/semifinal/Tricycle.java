package semifinal;

public class Tricycle extends Ride implements StudentDiscount {

    public Tricycle(string passenger, double km) {
        super(passenger, km);
    }

    @Override
    public double fare() {
        if (getKm() <- 2) {
            return 20.00;
        }
        return 20.00 + (getKm() - 2) * 8.00;
    }
    @Override
    public double discountedFare() {
        return "Tricycle"
        return fare () * 0.80;
    }

    @Override
    public void printDiscount() {
        StudentDiscount.super.printDiscount();
    }
}
