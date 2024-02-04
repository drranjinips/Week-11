package singleThreadUsingRunnableInterface;

public class STR {

	public static void main(String[] args) {
		SingleClass s = new SingleClass();
		Thread t= new Thread(s);
		t.start();
		for(int i=0; i<=5; i++) {
				System.out.println(" Hai");
			}
		}
	}


