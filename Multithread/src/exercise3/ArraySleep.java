package exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArraySleep implements Runnable {
	
	public void randomArray (String threadName) {
		
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
				//System.out.println(threadName + "[Random Array Extraction W1] => " + i + " array["+i+"] : "+result[i]);
				
				if (threadName == "word1") {

					try {
						System.out.print(result[i] + " ");

						// suspend current thread for 5 second
						Thread.sleep(5000);

					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				} else // word2 is executing
					System.out.print(result[i] + " ");
			}
			System.out.println("\n\n" + threadName + " = Suspended");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void extractTextPortion() {

		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("It");
		  list_Strings.add("is");
		  list_Strings.add("recommended");
		  list_Strings.add("to");
		  list_Strings.add("use");
		  list_Strings.add("Calendar");
		  list_Strings.add("class.");
		  System.out.println("\n" + "Original list: " + list_Strings);
		  List<String> sub_List = list_Strings.subList(0, 7);
		  System.out.println("List of first 7 elements: " + sub_List + "\n");
		  
			int repeat = 10;
			String result[] = new String[repeat];
			for(int i=0, j=0; i<repeat && j<list_Strings.size(); i++, j++)
			{
				result[i] = list_Strings.get(j);
				if(j == list_Strings.size() -1)
			         j = -1;
				System.out.print("[extract words] => " + i + ": ");
				
				for(String word : result)
				{
					if(word != null) { 
						System.out.print("[" + word + "] ");
			         }
				}
				
				System.out.println();
			}

	}
	
	@Override
	public void run() {
		
		// Get current thread
		Thread currentThread = Thread.currentThread();
		String getThreadName = currentThread.getName();
		
		System.out.println("Thread " + getThreadName + " is running...");

		// if threadName = text, then execute method b => extractTextPortion()
		if (getThreadName == "text")
			extractTextPortion();

		// if threadName = word1 or word2, then execute method c => randomizeWords()
		else if (getThreadName == "word1" || getThreadName == "word2")
			randomArray(getThreadName);
		
		System.out.println("Thread " + getThreadName + " is finished...\n");
		
	}
}
