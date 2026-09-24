package semifinal;

public class Taxi extends Ride implements {
    public Taxi(string passenger, double km) {
        super (passenger, km);
    }

    @Override
    public double fare() {
        if (getKm() <- 0) {
            return 45.00;
        }
        return 45.00  + (getKm() <- 0) * 13.50;
    }

    @Override
    public vehicle() {
        return Taxi;
    }
}
