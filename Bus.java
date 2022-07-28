
package busresev;

public class Bus {

	    private int busNo;
		private boolean ac;
		private int capacity; 
		
		Bus(int no,boolean ac, int cap){
			this.busNo =no;
			this.ac = ac;
			this.capacity = cap;
		}
		
		public int  getBusNo() {
			return busNo;
		}
		
		public void setCapacity(int capp) {
			capacity = capp;
			
		}
		
		public int getCapacity() {
			return capacity;
		}
		
		public void setAc(boolean aC) {
			ac = aC;
		}
		
		public boolean getAc() {
			return ac;
		}
		
      
      public void displaybusInfo(){
    	  System.out.println("bus no :" +busNo + "Ac:" + ac +"tot cpacity:" + capacity);
      }
	}


