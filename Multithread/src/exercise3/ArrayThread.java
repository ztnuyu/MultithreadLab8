package exercise3;

public class ArrayThread extends Thread {
	
	public void printArrayThread() {

		try {
			String arr[] = {"It", "is", "recommended", "to", "use", "Calendar", "class."};
			int repeat = 10;
			String result[] = new String[repeat];
			for(int i=0, j=0; i<repeat && j<arr.length; i++, j++)
			{
				result[i] = arr[j];
				if(j == arr.length -1)
			         j = -1;
				System.out.println("[Normal Array Extraction] => " + i + " array["+i+"] : "+result[i]);
				
				Thread.sleep(5000);
			}
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		// Execute task
		printArrayThread();

	}
}