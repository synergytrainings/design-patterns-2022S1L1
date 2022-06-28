package Builder;

public class Main {
    public static void main(String[] args) {
        FlightTicket flightTicket = new FlightTicket.TicketBuilder("Yerevan", "Moscow", "28.06.2020", "28.07.2020").setBaggageWeight(10)
                .setClass(CabinClass.BUSINESS).build();

        System.out.println(flightTicket);
    }
}
