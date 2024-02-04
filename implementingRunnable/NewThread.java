package implementingRunnable;

public class NewThread implements Runnable{
	
	Thread t;
	NewThread (){
		t= new Thread(this, "Demo Thread");
		System.out.println("Child Thread" + t);
	}
	public void run() {
		try {
			for (int i=5; i>0; i--) {
				System.out.println("Child Thread" + i);
				Thread.sleep(1000);
			}
			
		}
	catch(InterruptedException e) {
		System.out.println("Child Interrupted");
	}
		System.out.println("Existing Child Thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
