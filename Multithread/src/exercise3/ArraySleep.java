package exercise3;

import java.util.Random;

public class ArraySleep implements Runnable {
	
	public void printArraySleep (String threadName) {
		
		try {
			String arr[] = {"It", "is", "recommended", "to", "use", "Calendar", "class."};
			int repeat = 10;
			String result[] = new String[repeat];
			Random rand = new Random();
			for(int i=0, j=0; i<repeat && j<arr.length; i++, j++)
			{
				int randomIndexToSwap = rand.nextInt(arr.length);
				result[i] = arr[randomIndexToSwap];
				if(j == arr.length -1)
			         j = -1;
				System.out.println(threadName + "[Random Array Extraction W1] => " + i + " array["+i+"] : "+result[i]);
				
				Thread.sleep(1000);
			}
			System.out.println("Suspended");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		// Get current thread
		Thread currentThread = Thread.currentThread();
		
		// Execute task
		printArraySleep(currentThread.getName());
		
	}
}