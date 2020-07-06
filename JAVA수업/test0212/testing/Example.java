package testing;

public class Example {

	public static void main(String[] args) {
		
		
		RemoteControl ri = new Television();
		ri.turnOn();
		ri.Volume(12);
		ri.turnOff();
		
		ri = new Audio();
		ri.turnOn();
		ri.Volume(13);
		ri.turnOff();
		

	}

}
