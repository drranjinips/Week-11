package builtinMethods;

public class ChildThread extends Thread{
public void run() {
	for(int i=1; i<=5;i++) {
		System.out.println("Child Thread is Running");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
