package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		{    
			int a=0,b=1,c,d;   
			System.out.println("Fibonnaci Series ");
			System.out.print(a+ " " +b);
			for(d=1;d<10;++d) {
				c=a+b;    
				System.out.print(" " +c);    
				a=b;    
				b=c;    
			} 
		}
	}
}
