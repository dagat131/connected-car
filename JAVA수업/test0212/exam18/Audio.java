package exam18;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("-- Audio를 켭니다. --");
		
	}

	@Override
	public void trunOff() {
		System.out.println("-- Audio를 끕니다. --");
		
	}

	@Override
	public void setVolume(int i) {
		System.out.println("-- Audio의 볼륨 크기를 "+ i + " 로 조정합니다. --");
		
	}

}
