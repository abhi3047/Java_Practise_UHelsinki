package FlightControl.domain;

public class Flight {

    private String departureId;
    private String destinationId;
    private Airplane airplane;

    public Flight(Airplane airplane,String departureId, String destinationId){
        this.airplane=airplane;
        this.departureId=departureId;
        this.destinationId=destinationId;
    }

    public String getDepartureId() {
        return departureId;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public String toString(){
        return this.airplane.toString() + " (" + this.getDepartureId() + "-" + this.getDestinationId() + ")";
    }
}
