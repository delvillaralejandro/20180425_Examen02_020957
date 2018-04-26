public class doSellCar implements Robocmd{
	String job = "Sell Car";
	
	Robomaidone one;
	Robomaidtwo two;
	Robomaidthree three;

	public doSellCar(Robomaidthree o) {
		this.three = o;
	}	
	
	@Override
	public void Execute() {
		System.out.println("Doing job: " + job);
		three.Operate();
	}

	@Override
	public void Done() {
		System.out.println("Sell Car job has been satisfied!");
		System.out.println("Shuting down!");
		one.Shutdown();
		
	}

}
