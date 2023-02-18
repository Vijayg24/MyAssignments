package week3.day1;

	public class AxisBank extends Bank{
		public void deposit() {
			System.out.println("9.1% to 12.5%");
		}

		public static void main(String[] args) {
			AxisBank depo= new AxisBank();
			
			depo.saving();
			depo.fixed();
			depo.deposit();
		}

	}
