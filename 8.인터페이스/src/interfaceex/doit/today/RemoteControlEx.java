package interfaceex.doit.today;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc = null;//인터페이스 참조변수 선언
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
	}

}
