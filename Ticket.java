class Ticket {
    int pnr;
    Passenger passenger;
    String source;
    String destination;

    Ticket(int pnr, Passenger passenger, String source, String destination) {
        this.pnr = pnr;
        this.passenger = passenger;
        this.source = source;
        this.destination = destination;
    }
}
