
public class Main {
	public static void main(String args[]) {
		Client i = new Client();
		Robomaidone One = new Robomaidone();
		Robomaidtwo Two = new Robomaidtwo();
		Robomaidthree Three = new Robomaidthree();
		
		i.setCommand(new doLawn(One), 1, 20);//cmmd, robo, minutes
		i.setCommand(new doCook(Two), 2, 50);
		i.setCommand(new doSellCar(Three), 3, 30);
		
		i.roboOne();
		i.roboTwo();
		i.roboThree();
		System.out.println("==//==//==//==//==/Robot Logs/==//==//==//==//");
		i.consulLog();
		
		One.Shutdown();
		Two.Shutdown();
		Three.Shutdown();
	}
}
