public class doCook implements Robocmd{
	String job = "Cook";
	
	Robomaidone one;
	Robomaidtwo two;
	Robomaidthree three;

	public doCook(Robomaidtwo o) {
		this.two = o;
	}	
	
	@Override
	public void Execute() {
		System.out.println("Doing job: " + job);
		two.Operate();
	}

	@Override
	public void Done() {
		System.out.println("Cook job has been satisfied!");
		System.out.println("Shuting down!");
		one.Shutdown();
		
	}

}
