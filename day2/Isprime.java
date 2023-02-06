package week1.day2;

public class Isprime {
public static void main(String[] args) {

    int num = 6;
    boolean pri = false;
    for (int i = 2; i <= num / 2; ++i) {
    
      if (num % i == 0) {
    	  pri = true;
        break;
      }
    }

    if (!pri)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}