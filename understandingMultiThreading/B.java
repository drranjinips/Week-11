package understandingMultiThreading;

public class B {

	public static void main(String[] args) throws InterruptedException
{
		A t = new A();
		t.start();
		for(int i=1; i<=5; i++) {
			System.out.println("Abid");
			Thread.sleep(1000);
			}

	}
}


