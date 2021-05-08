package exercise2;

import java.util.Random;

public class Array implements Runnable {
	
	public void printArray (String currentThread) {
		
		String arr[] = {"It", "is", "recommended", "to", "use", "Calendar", "class."};
		int repeat = 10;
		String result[] = new String[repeat];
		for(int i=0, j=0; i<repeat && j<arr.length; i++, j++)
		{
			result[i] = arr[j];
			if(j == arr.length -1)
		         j = -1;
			System.out.println(currentThread + "[Normal Array Extraction] => " + i + " array["+i+"] : "+result[i]);
		}
	
	}
	
	public void printArrayRandom (String randThread) {
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
			System.out.println(randThread + "[Random Array Extraction] => " + i + " array["+i+"] : "+result[i]);
		}
	}
	
	@Override
	public void run() {
		
		// Get current thread
		Thread text = Thread.currentThread();
		Thread word1 = Thread.currentThread();
		
		// Execute task
		printArray(text.getName());
		System.out.println("-------------");
		printArrayRandom(word1.getName());
	}

}