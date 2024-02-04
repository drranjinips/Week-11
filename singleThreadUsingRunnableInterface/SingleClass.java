package singleThreadUsingRunnableInterface;

public class SingleClass implements Runnable{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
