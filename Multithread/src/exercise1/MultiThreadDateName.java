package exercise1;

public class MultiThreadDateName {
	public static void main(String[] args) {

		// Create objects of runnable
		Runnable datePrinter1 = new DateName();
		Runnable datePrinter2 = new DateName();
		
		// Create objects of thread with name
		Thread printerThread1 = new Thread(datePrinter1, "printerThread [1]");
		Thread printerThread2 = new Thread(datePrinter2, "printerThread [2]");
		
		// Execute thread
		printerThread1.start();
		printerThread2.start();

	}
}