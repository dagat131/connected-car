package exam11;

public class Person {
	private String name = "ȫ�浿";
	private int age;
	private String address;
	
	public String getName() {   //���� ù���ڸ� �빮�ڷ� ����Ѵ�.  Getter
		return name;
	}
	public void setName(String name) { // Setter
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	//getter setter ���ϰ� �̿밡����. ������ Ŭ���� source - �Ʒ��ʿ� ���� ����,���� ����.
}
