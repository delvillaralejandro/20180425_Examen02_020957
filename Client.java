
public class Client {//invoker
	public Robocmd cmd;
	Robocmd log;
	Robocmd lCommands[] = new Robocmd[3];
	
	int time; //time will be taken as minutes
	
	public void setCommand(Robocmd cmd, int i, int t) {
		if(i <= 3 && i >= 1) {
			lCommands[i - 1] = cmd;
		}
	}
	public void roboOne() {
		if(lCommands[0] != null) {
			lCommands[0].Execute();
			log = lCommands[0];
		}
	}
	
	public void roboTwo() {
		if(lCommands[1] != null) {
			lCommands[1].Execute();
			log = lCommands[1];
		}
	}
	
	public void roboThree() {
		if(lCommands[2] != null) {
			lCommands[2].Execute();
			log = lCommands[2];
		}
	}
	
	public void consulLog() {
		System.out.println(lCommands[0]);
		System.out.println(lCommands[1]);
		System.out.println(lCommands[2]);
		System.out.println(log);
		
	}
	
	

}
