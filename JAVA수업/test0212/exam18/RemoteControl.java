package exam18;

public interface RemoteControl { //�������̽��� ����� �߻�޼ҵ常�� ������ �ִ�.
	public static final int MIN_VOLUME = 0;
	public static final int MAX_VOLUME = 10;
	
	void turnOn();
	void trunOff();
	void setVolume(int i);
}
