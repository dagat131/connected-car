package testing;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("--- TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("--- TV를 끕니다");
	}

	@Override
	public void Volume(int i) {
		for(i = 0; i < MAX_VOLUME; ) {
			for(i= MIN_VOLUME; i > MIN_VOLUME; ) {
			}
		}
		System.out.println("--- 볼륨을 " + i + " 로 조정합니다.");
	}
	
}
