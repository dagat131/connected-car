package exam18;

public class Example {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(7);
		rc.trunOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.trunOff();
		
	}

}
