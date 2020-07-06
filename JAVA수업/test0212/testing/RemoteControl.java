package testing;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void Volume(int i);
	
}
