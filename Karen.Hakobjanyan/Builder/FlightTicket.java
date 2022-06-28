package Builder;

import javax.xml.crypto.Data;
import java.time.LocalDate;

public class FlightTicket {
    private final String from;
    private final String to;
    private final String departureDay;
    private final String arrivalDay;

    private final int baggageWeight;
    private final boolean meal;
    private final CabinClass cabinClass;

    public static class TicketBuilder {
        private final String from;
        private final String to;
        private final String departureDay;
        private final String arrivalDay;

        private int baggageWeight = 0;
        private boolean meal = false;
        private CabinClass cabinClass = CabinClass.ECONOMY;

        public TicketBuilder(String from, String to, String departureDay, String arrivalDay){
            this.from = from;
            this.to = to;
            this.departureDay = departureDay;
            this.arrivalDay = arrivalDay;
        }

        public TicketBuilder setBaggageWeight(int baggageWeight) {
            this.baggageWeight = baggageWeight;
            return this;
        }

        public TicketBuilder setMeal() {
            this.meal = true;
            return this;
        }

        public TicketBuilder setClass(CabinClass cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }

        public FlightTicket build() {
            return new FlightTicket(this);
        }
    }

    private FlightTicket(TicketBuilder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.departureDay = builder.departureDay;
        this.arrivalDay = builder.arrivalDay;
        this.baggageWeight = builder.baggageWeight;
        this.cabinClass = builder.cabinClass;
        this.meal = builder.meal;
    }

    @Override
    public String toString() {
        return "FlightTicket{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", departureDay='" + departureDay + '\'' +
                ", arrivalDay='" + arrivalDay + '\'' +
                ", baggageWeight=" + baggageWeight +
                ", meal=" + meal +
                ", cabinClass=" + cabinClass +
                '}';
    }
}

