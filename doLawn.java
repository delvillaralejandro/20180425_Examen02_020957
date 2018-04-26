
public class doLawn implements Robocmd{
	String job = "Lawn";
	
	Robomaidone one;
	Robomaidtwo two;
	Robomaidthree three;

	public doLawn(Robomaidone o) {
		this.one = o;
	}	
	
	@Override
	public void Execute() {
		System.out.println("Doing job: " + job);
		one.Operate();
	}

	@Override
	public void Done() {
		System.out.println("Lawn job has been satisfied!");
		System.out.println("Shuting down!");
		one.Shutdown();
		
	}

}
