package exam18;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("-- Audio�� �մϴ�. --");
		
	}

	@Override
	public void trunOff() {
		System.out.println("-- Audio�� ���ϴ�. --");
		
	}

	@Override
	public void setVolume(int i) {
		System.out.println("-- Audio�� ���� ũ�⸦ "+ i + " �� �����մϴ�. --");
		
	}

}
