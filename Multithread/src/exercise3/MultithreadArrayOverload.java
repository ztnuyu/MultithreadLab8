package exercise3;

public class MultithreadArrayOverload {
	

	public static void main(String[] args) {
		
		Runnable arrayS = new ArraySleep();
		Runnable arrayS2 = new ArraySleep();
		Runnable arrayS3 = new ArraySleep();
		Thread thrd1 = new Thread(arrayS);
		Thread thrd2 = new Thread(arrayS2);
		Thread thrd3 = new Thread(arrayS3);
		
		
		thrd1.setName("text");
		thrd2.setName("word1");
		thrd3.setName("word2");
		
		thrd3.start();
		thrd1.start();
		thrd2.start();
	}
}
