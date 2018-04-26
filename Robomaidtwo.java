
public class Robomaidtwo implements Robomaid{
	String robo = "2";
	doLawn lawn;
	int time;

	@Override
	public void Operate() {
		 System.out.println("Robomaid" + robo + " is working...");
		
	}


	@Override
	public void Shutdown() {
		System.out.println("Robotmaid is shutting down!");
		System.exit(0);
	}
	
	
}
