package exam11;

public class PersonExample {
	public static void main(String[] args) {
//		Person p = new Person();
//		System.out.println(p.name);   //���� Ŭ������ �ƴ϶� ������ �ȵ�
		
//		Person p = new Person();
//		System.out.println(p.name);   //error
		
		Person p = new Person();
		System.out.println(p.getName());
		String name = p.getName();
		System.out.println(name);
		
		Person a = new Person();
		int age = a.getAge();
		System.out.println(age);
		
		Person add = new Person();
		String address = add.getAddress();
		System.out.println(address);
		
		p.setName("��ö��");
		System.out.println(p.getName());
		
	}

}
