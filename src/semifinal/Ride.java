package semifinal;

public abstract class Ride {



    private static int nextId = 1;
    private final int id;
    private final String passenger;
    private final double km;

    protected Ride(int id) {
        this.id = id;
    }
    public Ride (String pasenger, double km) {
        this.id = nextId++;
        this.passenger = passenger;
        this.km = km;
    }
    public void Ticket() {
        System.out.println("--------------------------------------------");
        System.out.println("Ticket #" + id + " | " + vehicle());
        System.out.println(" Passenger     :" + passenger);
        System.out.println(" Distance      :" +  km);
        System.out.println(" Fare          :" + fare());
    }

    @Overload
    call printTicket();
    print " Note        :" + note;
}
