package synchronization;

public class CakeCounter {
int cakecount=0;
public synchronized void increment() {
	cakecount++;
}
}
