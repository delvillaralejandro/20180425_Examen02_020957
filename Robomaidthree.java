
public class Robomaidthree implements Robomaid{
	String robo = "3";
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
