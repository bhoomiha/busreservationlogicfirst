package busresev;
import java.text.ParseException;
import java.util.*;
public class BusDemo {

	public static void main(String[] args) throws ParseException {
		int userOpt=1;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
	    ArrayList<Booking> bk = new ArrayList<Booking>();	
	
		
		buses.add(new Bus (1,true,4));
		buses.add(new Bus (2,true,50));
		
		
		
		for( Bus b: buses) {
			b.displaybusInfo();
		}
	
		while(userOpt==1) {
              System.out.println("enter 1 to book and 2 to exit");
              userOpt = sc.nextInt();
              if(userOpt==1) {
            	  Booking book  = new Booking();
            	  if(book.isAvailable(bk, buses)) {
            		  bk.add(book);
            		  System.out.println("your booking is confirmed");
            		  System.out.println(book.toString());
            	  }
            	  else {
            		  System.out.println("sorry bus is full. try another bus");
            	  }
              }
		}
	}

}
