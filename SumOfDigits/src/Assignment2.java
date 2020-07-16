//write a java program and compute the sum of the digits of an integer.
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new  Scanner(System.in);
		System.out.println("input an integer:");
		int digits = in.nextInt();
		System.out.println("the sum is "+ sumDigits(digits));  
	}
	public static int sumDigits(long n) {
		int result = 0 ;
		while(n>0) {
			result += n%10;
			n/=10;
			
		}
		return result;
	}

}
