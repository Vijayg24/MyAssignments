package week1.day2;

public class CarDetails {
	public static void main(String[] args) {
	CarDetails obj = new CarDetails();
	int n = obj.getCarName();
	System.out.println(n);
	String name = obj.getOwnersName();
	System.out.println(name);
	boolean Punchered = obj.isCarPunchered();
	System.out.println(Punchered);
	obj.carName("Audi");
	System.out.println(obj.subTwoNum(10, 24));
	System.out.println(obj.mulThreeNum(2, 4, 6));
	System.out.println(obj.divTwoNum(1, 3));
	
	}
			public int getCarName() {
		return 18245;
	}
	private String getOwnersName() {
		return "Vijay";
	}
	 void carName(String String) 
	 {
		System.out.println("Audi");
	}
	public boolean isCarPunchered() {
		return true;
	}
	
	public int subTwoNum(int a, int b) {
	return a-b;
	}
	
	public int mulThreeNum(int a, int b, int c) {
		return a*b*c;
	}
	public int divTwoNum(int a, int b) {
		return a/b;
		
	}
}

