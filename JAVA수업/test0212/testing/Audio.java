package testing;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("--- º¼·ýÀ» Åµ´Ï´Ù");
		
	}

	@Override
	public void turnOff() {
		System.out.println("--- º¼·ýÀ» ²ü´Ï´Ù");
	}

	@Override
	public void Volume(int i) {
		for(i = 0; i < MAX_VOLUME; i++) {
			}
		for(i=0; i > MIN_VOLUME; i++) {
		}
		System.out.println("--- º¼·ýÀ» " + i + " ·Î ¼³Á¤ÇÕ´Ï´Ù.");
		
	}
	
}
