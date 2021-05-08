package exercise1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateName implements Runnable {
	public void printDateName (String currentThread) {
		
		for (int counter = 1; counter <= 5; counter++) {
			SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		    Date date = new Date();
			System.out.println(currentThread + " -> " + counter + ". Date is -> " + formatter.format(date));
		}
	}
	
	@Override
	public void run() {
		
		// Get current thread
		Thread currentThread = Thread.currentThread();
		
		// Execute task
		printDateName(currentThread.getName());
	}

}