package chapter5;

public class MyDateTest {

	public static void main(String[] args) {
		 MyDate date = new MyDate();
	       
	      date.setYear(2019);
	      date.setMonth(15);
	      date.setDay(12);
	    
	      date.showDate();
	    
	      MyDate date2 = new MyDate();
	      date2.setYear(2002);  
	    
	      date2.showDate();
	}

}
