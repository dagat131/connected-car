package testing;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("--- TV�� �մϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("--- TV�� ���ϴ�");
	}

	@Override
	public void Volume(int i) {
		for(i = 0; i < MAX_VOLUME; ) {
			for(i= MIN_VOLUME; i > MIN_VOLUME; ) {
			}
		}
		System.out.println("--- ������ " + i + " �� �����մϴ�.");
	}
	
}
