package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("ID - "+id);
	}
   public void getStudentInfo(int id, String name) {
	   System.out.println("ID - "+id);
	   System.out.println("Name - "+name);
	}
   public void getStudentInfo(String mail, long ph) {
	   System.out.println("Mail - "+mail);
	   System.out.println("Phone - "+ph);
}
	public static void main(String[] args) {
		Students s= new Students();
		s.getStudentInfo(1);
		s.getStudentInfo(2, "Vijayakumar");
		s.getStudentInfo("vijayakumarg@gmail.com", 8056234);
		
	}

}