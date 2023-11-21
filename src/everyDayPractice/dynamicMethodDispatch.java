package everyDayPractice;

class phone {

	void showtime() {
		System.out.println("Time is 9am");
	}

	void on() {
		System.out.println("Phone ON");
	}
}

class SmartPhone extends phone {
	void on() {
		System.out.println("Smart phone is on");
	}

	void music() {
		System.out.println("Music started");
	}
}

public class dynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone obj = new SmartPhone();
		obj.on();
		obj.showtime();

	}

}
