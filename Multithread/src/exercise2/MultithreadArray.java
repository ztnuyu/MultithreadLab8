package exercise2;

public class MultithreadArray {

	public static void main(String args[]) {
		Runnable arrayPrinter1 = new Array();
		Runnable arrayPrinter2 = new Array();
		
		Thread  thrd1 = new Thread(arrayPrinter1, "Thread [txt]");
		Thread thrd2 = new Thread(arrayPrinter2, "Thread [word1]");
		
		thrd1.start();
		thrd2.start();
    }
}
