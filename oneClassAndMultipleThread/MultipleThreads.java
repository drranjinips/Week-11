package oneClassAndMultipleThread;

public class MultipleThreads extends Thread{
	String name;
	MultipleThreads(String n){
	name=n;
	}
	public void run() {
		for(int i=1; i <=5; i++) {
			System.out.println(name  + " " + i);
		}
		System.out.println("Exiting From " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
