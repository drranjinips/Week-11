package synchronization;

public class Team implements Runnable{
	CakeCounter counter;
	Team(CakeCounter counter){
		this.counter=counter;
	}
public void run() {
	for (int  i=0; i<1000; i++) {
		counter.increment();
	}
}
}
