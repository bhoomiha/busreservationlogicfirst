
package busresev;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking{

		int busNo;
        String passengerName;
        Date date; 
        
        Scanner re = new Scanner(System.in); 
        
        Booking() throws ParseException{
        	System.out.println("Enter name");
        	passengerName  = re.nextLine();
        	System.out.println("Enter busno");
        	busNo = re.nextInt();
        	System.out.println("Enter date in dd-mm-yy");
        	String dateInput = re.next(); 
        	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        	
        	date = dateFormat.parse(dateInput);
        	
        }
        
        public boolean isAvailable(ArrayList<Booking> buk, ArrayList<Bus> buss ) {
        	int capacityy = 0;
        	
        	for(Bus bis : buss) {
        		if(bis.getBusNo() == busNo)
        			capacityy =bis.getCapacity();
        	}
        	int booked = 0;
        	for(Booking b: buk) {
        		if(b.busNo == busNo && b.date.equals(date)) {
        		 booked++;	
        		}
        	}
        	return booked< capacityy ? true : false ;
        	
        }
        
}       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	


