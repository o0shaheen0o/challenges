/*
 * reverse an integer useing a StringBuilder.revers()
 * and using %
 */
public class ReversIntigers {

	private int n= 12345;
	public static void main(String[] args) {
		new ReversIntigers().reverseByString();
		new ReversIntigers().reversByLong();

	}
	
	public void reverseByString() {
		StringBuilder sb = new StringBuilder(Integer.toString(n));
		System.out.println(sb.reverse());
	}
	public void reversByLong() {
		long result=0;
		while (!(n%10==0))
		{
			int lastDigit = n%10;
			n=n/10;
			result =result*10+lastDigit;
		}
		System.out.println(result);

	}

}
