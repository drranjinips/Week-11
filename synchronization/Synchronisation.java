package synchronization;

public class Synchronisation {

	public static void main(String[] args) {
		
			CakeCounter counter = new CakeCounter();
			Thread Team1 = new Thread(new Team(counter));
			Thread Team2 = new Thread(new Team(counter));
			Team1.start();
			Team2.start();
			try {
				Team1.join();
				Team2.join();
				
			}
			catch(Exception e) {
				
			}
			System.out.println(counter.cakecount);
		
		}
		


}
