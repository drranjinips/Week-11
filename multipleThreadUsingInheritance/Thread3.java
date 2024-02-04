package multipleThreadUsingInheritance;

public class Thread3 extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Thread2 " + (i*10));
		}
		System.out.println("Exiting from Thread3  ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
