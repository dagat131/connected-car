package exam11;

public class Person {
	private String name = "홍길동";
	private int age;
	private String address;
	
	public String getName() {   //값의 첫글자를 대문자로 써야한다.  Getter
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
	
	
	//getter setter 편하게 이용가능함. 오른쪽 클릭후 source - 아래쪽에 보면 겟터,셋터 있음.
}
