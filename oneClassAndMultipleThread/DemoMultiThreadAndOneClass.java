package oneClassAndMultipleThread;

public class DemoMultiThreadAndOneClass {

	public static void main(String[] args) {
		MultipleThreads obj1 = new MultipleThreads("ThreadOne");
		MultipleThreads obj2 = new MultipleThreads("ThreadTwo");
		obj1.start();
		obj2.start();
		
	}

}
