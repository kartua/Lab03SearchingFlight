/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kartua
 */
import java.util.GregorianCalendar;

public class Flight implements Comparable <Flight>{
    private String source, destination, airline;
    private GregorianCalendar departure, arrival;
    public Comparable com;
    
    public Flight(String s, String des, String al, GregorianCalendar dep, 
            GregorianCalendar arr){ 
        source = s;
        destination = des;
        airline = al;
        departure = dep;
        arrival = arr;

    }
    public Flight(String s, String des, String al){
        source = s;
        destination = des;
        airline = al;
    
    }
    public String toString(){
        String output;
        if(departure == null && arrival == null){
            output = "Source City: " + source;
            output += "\nDestination City: " + destination;
            output += "\nAirline: " + airline;
        }
        else {
            output = "Source City: " + source;
            output += "\nDestination City: " + destination;
            output += "\nAirline: " + airline;
            output += "\nDeparture: " + departure.getTime();
            output += "\nArrival: "  + arrival.getTime();
        }
        return output;
    }

    private String flightStr(){
        String output;
        output = source+destination+airline;
        output = output.replace(" ", "");
        return output;
    }
    public int compareTo(Flight o) {
        return this.flightStr().compareToIgnoreCase(o.flightStr());
    }
    
    public static void main(String[] args) {
        
    }
    
}