package exam18;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("-- TV�� �մϴ�. --");
		
	}

	@Override
	public void trunOff() {
		System.out.println("-- TV�� ���ϴ�. --");
		
	}

	@Override
	public void setVolume(int i) {
		System.out.println("-- Television�� ���� ũ�⸦" + i + "�� �մϴ�. --");
		
	}

}
