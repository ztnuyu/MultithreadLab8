package exercise3;

public class MultithreadArrayOverload {
	

	public static void main(String[] args) {
		
		Runnable arrayS = new ArraySleep();
		Thread Word1 = new Thread(arrayS);
		Word1.setName("arraySleepThread");
		
		Thread arrT = new ArrayThread();
		arrT.setName("arrayThread");
		
		Word1.start();
		arrT.start();

	}

}
