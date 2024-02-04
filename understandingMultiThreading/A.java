package understandingMultiThreading;

public class A extends Thread{
public void run() {
try {
	for(int i=1; i<=5; i++) {
	System.out.println("Anush");
	Thread.sleep(1000);
	}
}
catch(InterruptedException e) {
	
}
}
}
