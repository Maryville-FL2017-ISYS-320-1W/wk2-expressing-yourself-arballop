/*
  	ISYS 320
  	Name(s):
  	Date: 
*/
// Paysen Arballo
/*
 	Your predicted values for the expressions
	1.14 I was wrong the answer is 8 because java calculates * first even without ().
	2..05 I was wrong the answer is 11 I did  not understand how to calculate because java does not follow the PEMDAS.
	3.12 I was right because this time there were () and java evaluated them first.
	4.5 The answer to this is 4 i was one digit off because of human mistake of calculation.
	5.5 I was wrong because i do not fully understand how the remainder operator works entirely.
	6.11 I was right because this is a very straight forward example.
	7.2+7 I was wrong because you take the string and keep the following numbers connected instead of evaluating.
	8.7+2 I was wrong because I evaluated and did not keep the 2 that follows the 7.
 
 	After testing the expressions in the main method, indicate above if your predictions were correct.
*/

public class TestExpressions {

	public static void main(String[] args) {
		System.out.println(2 + 3 * 4 - 6);
		System.out.println(14 / 7 * 2 + 30 / 5 + 1);
		System.out.println(( 12 + 6 ) / 3 * 2);
		System.out.println((238 % 10 + 3 ) % 7);
		System.out.println(6 * 7 % 4);
		System.out.println(2 + 2 + 3 + 4);
		System.out.println("2 + 2" + 3 + 4);
		System.out.println(3 + 4 + "2 + 2");
	}

}
