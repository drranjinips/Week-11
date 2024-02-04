package builtinMethods;

public class DemonstrationOfBuitInMethods {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("The Current Thread is "+ t.getName());
		t.setName("MYTHREAD");
		System.out.println("The  Thread name after changing is "+ t.getName());
		System.out.println("The  Thread  priority is  "+ t.getPriority());
		t.setPriority(5);
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println("The  Thread  priority is  "+ t.getPriority());
		ChildThread ct=new ChildThread();
		ct.start();
		System.out.println("The  ChildThread  priority is  "+ct.getPriority());
	}

}
