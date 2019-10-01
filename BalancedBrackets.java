
public class BalancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "{[]}";
		System.out.println(balanced(input));
		
	}
	public static boolean balanced(String input)
	{
		int j =input.length()-1;
		boolean bal=false;
		for (int i =0;i<(input.length())/2;i++)
		{
			if ((input.charAt(i))==(bracketClose(input.charAt(j))))
			{
				bal=true;
			}
			else
			{
				bal=false;
				break;
			}
			j--;
		}
		return bal;
	}
	public static char bracketClose(char c )
	{
		switch (c)
		{

		case'}':
			return'{';
			
		case']': 
			return '[';
		case')': 
			return '(';	
			
		}
		return ' ';

		
	}

}
