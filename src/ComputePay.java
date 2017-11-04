/*
  	ISYS 320
  	Name(s):Paysen Arballo
  	Date: 11/02/2017
*/

public class ComputePay {
	public static void main(String[] args) {

		int Hours= 4 + 5 + 8 + 4;
		double salary = 8.75;
		double Pay = Hours * salary;
		
		System.out.println("My total hours worked:");
		System.out.println(Hours);
		System.out.println("My hourly salary:");
		System.out.println("$" + salary);
		System.out.println("My total pay:");
		System.out.println("$" + Pay);
		
	}
}