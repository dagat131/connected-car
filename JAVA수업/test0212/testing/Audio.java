package testing;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("--- ������ ŵ�ϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("--- ������ ���ϴ�");
	}

	@Override
	public void Volume(int i) {
		for(i = 0; i < MAX_VOLUME; i++) {
			}
		for(i=0; i > MIN_VOLUME; i++) {
		}
		System.out.println("--- ������ " + i + " �� �����մϴ�.");
		
	}
	
}
