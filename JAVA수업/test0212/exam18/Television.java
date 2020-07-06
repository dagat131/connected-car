package exam18;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("-- TV를 켭니다. --");
		
	}

	@Override
	public void trunOff() {
		System.out.println("-- TV를 끕니다. --");
		
	}

	@Override
	public void setVolume(int i) {
		System.out.println("-- Television의 볼륨 크기를" + i + "로 합니다. --");
		
	}

}
