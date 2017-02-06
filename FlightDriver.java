
import java.util.GregorianCalendar;

public class FlightDriver {

    public static void main(String[] args) {
        Flight[] flights
                = {
                    new Flight("Philadelphia", "Las Vegas", "Southwest",
                            new GregorianCalendar(2007, 1, 12, 5, 0, 0),
                            new GregorianCalendar(2007, 1, 12, 10, 0, 0)),
                    new Flight("Trenton", "Blacksburg",
                            "Trans-National Air",
                            new GregorianCalendar(2007, 7, 11, 13, 30, 0),
                            new GregorianCalendar(2007, 8, 11, 14, 30, 0)),
                    new Flight("Fairbanks", "Scotsdale", "Delta",
                            new GregorianCalendar(2007, 4, 4, 4, 0, 0),
                            new GregorianCalendar(2007, 4, 5, 0, 0, 0)),
                    new Flight("Reno", "Hartford", "American Airlines",
                            new GregorianCalendar(2008, 2, 24, 20, 0, 0),
                            new GregorianCalendar(2008, 2, 25, 3, 25, 0)),
                    new Flight("Ewing", "Houston", "Northwest",
                            new GregorianCalendar(2007, 4, 1, 13, 0, 0),
                            new GregorianCalendar(2007, 4, 1, 18, 20, 0)),
                    new Flight("Philadelphia", "Las Vegas", "Southwest",
                            new GregorianCalendar(2017, 1, 12, 5, 0, 0),
                            new GregorianCalendar(2017, 1, 12, 10, 0, 0))
                };  
        Flight target1 = new Flight("Philadelphia", "Las Vegas", "Southwest");
        Flight target2 = new Flight("Bangkok", "Hongkong", "Thai Airlines");
        
        linearSearch(flights, target1);
 
    }
    
    public static void linearSearch(Flight[] fl, Flight f){
        
        int i = 0;
        boolean found = false;
        while(i<= fl.length-1  && !found){
            if (f.compareTo(fl[i]) == 0){
                found = true;
                System.out.println("*******THE FLIGHT IS FOUND********");
                System.out.println(fl[i].toString());
            }
            i++;
        }
        if(!found) {
            System.out.println("*******THE FLIGHT IS NOT FOUND*******");
            System.out.println(f.toString());
         
        }
    }
}
