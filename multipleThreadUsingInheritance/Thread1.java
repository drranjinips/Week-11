package multipleThreadUsingInheritance;

public class Thread1 extends Thread{
	public void run() {
		for(int i=1; i<=5; i++){
		System.out.println("Thread1 " + (i*2));
	}
		System.out.println("Exiting Thread1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
