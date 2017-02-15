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

public class Flight implements Comparable<Flight> {

    private String source, destination, airline;
    private GregorianCalendar departure, arrival;

    //Constructor 
    public Flight(String s, String des, String al, GregorianCalendar dep,
            GregorianCalendar arr) {
        source = s;
        destination = des;
        airline = al;
        departure = dep;
        arrival = arr;

    }

    // Constructor without departure and arrival time.
    public Flight(String s, String des, String al) {
        source = s;
        destination = des;
        airline = al;

    }

    @Override
    public String toString() {
        String output;
        if (departure == null && arrival == null) {// w/o departing&arrival
            output = "Source City: " + source;
            output += "\nDestination City: " + destination;
            output += "\nAirline: " + airline;
        } else {// with all information
            output = "Source City: " + source;
            output += "\nDestination City: " + destination;
            output += "\nAirline: " + airline;
            output += "\nDeparture: " + departure.getTime();
            output += "\nArrival: " + arrival.getTime();
        }
        return output;
    }

    // create a string to compare flight
    public String flightStr() {
        String output;
        output = source + destination + airline;
        output = output.replace(" ", "");
        output = output.toLowerCase();
        //sourece, destination and airline w/o space and all lowercase
        return output;

    }

    // compare check destiation first then check source
    // *************** CONTAIN BUGS **************
    // Forexamples, same airline
    @Override
    public int compareTo(Flight target) {
        if (destination.equals(target.destination)) {
            return source.compareToIgnoreCase(target.source);
        } //compare base on source
        else {
            return source.compareToIgnoreCase(target.source);
        }
    }
    //Call linearSearch in Searching to search for the flight
    public static void searchL(Flight[] data, Flight target){
        if(Searching.linearSearch(data, 0, data.length-1, target))    
            System.out.println("**********THE FLGHT IS FOUND**********\n"
             + target.toString());
        else System.out.println("**********THE FLIGHT IS NOT FOUND**********\n"
                    + target.toString());
    }
    //Call binarySearch in Searching
    public static void searchB(Flight[] data, Flight target){
        Sorting.selectionSort(data);
        if(Searching.binarySearch(data, 0, data.length-1, target))    
            System.out.println("**********THE FLGHT IS FOUND**********\n"
             + target.toString());
        else System.out.println("**********THE FLIGHT IS NOT FOUND**********\n"
                    + target.toString());
    }
    //CompareTo call flightStr() to compare 
//    public int compareTo(Flight target) {
//        return flightStr().compareTo(target.flightStr());
//    }
}
