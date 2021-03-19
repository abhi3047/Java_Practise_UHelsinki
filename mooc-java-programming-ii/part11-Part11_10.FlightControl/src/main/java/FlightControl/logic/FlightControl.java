package FlightControl.logic;
import FlightControl.domain.*;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;


public class FlightControl {
    private HashMap<String,Airplane> airplanes;
    private HashMap<String,Flight> flights;

    public FlightControl(){
        this.airplanes=new HashMap<>();
        this.flights=new HashMap<>();
    }

    public void addAirplane(String ID,int capacity){
        Airplane airplane=new Airplane(ID,capacity);
        this.airplanes.putIfAbsent(ID,airplane);

    }

    public void addFlights(Airplane airplane,String depatureId,String destinationId){
        Flight flight=new Flight(airplane,depatureId,destinationId);
        this.flights.putIfAbsent(flight.toString(),flight);
    }

    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Airplane getAirplane(String Id){
        return this.airplanes.get(Id);
    }
}
