package exam18;

public interface RemoteControl { //인터페이스엔 상수와 추상메소드만을 적을수 있다.
	public static final int MIN_VOLUME = 0;
	public static final int MAX_VOLUME = 10;
	
	void turnOn();
	void trunOff();
	void setVolume(int i);
}
