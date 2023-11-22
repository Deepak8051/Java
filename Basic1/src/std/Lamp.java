package std;
public class Lamp {
	boolean isOn,isOf;
	void turnOn() {
		isOn=  true;
		System.out.println("Light is on"+isOn);

	}
	void turnOff() {
		isOf = false;
		System.out.println("Light is of:"+isOf);


	}

}
class Main {
	public static void main(String[]args) {
		Lamp led = new Lamp();
		Lamp halogen = new Lamp();
		led.turnOff();
		halogen.turnOn();

	}

}
