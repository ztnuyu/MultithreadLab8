package exercise2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Array implements Runnable {
	
public void randomArray () {
		
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
				System.out.println("[Random Array Extraction W1] => " + i + " array["+i+"] : "+result[i]);
			}
			
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
		
		// Get current thread & its name
				Thread currentThread = Thread.currentThread();
				String threadName = currentThread.getName();

				System.out.println("Thread " + threadName + " is running...");
				
				if (threadName == "Thread [txt]")
					extractTextPortion();

				
				else if (threadName == "Thread [word1]" || threadName == "word2")
					randomArray();
				
				System.out.println("Thread " + threadName + " is finished...\n");
	}

}
