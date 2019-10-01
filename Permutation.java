import java.util.Arrays;

public class Permutation {

	int part1position;
	int swapPart1backToFront;
	
	String part1 []= {"A","B","C","D"};
	String part2 ;
	int counter=1;
	
	public Permutation() {
	
		
		part2 = new String("E");
		swapPart1backToFront= part1.length-1;
		part1position=0;
	}
	public Permutation(String []dectinary)
	{
		part1=Arrays.copyOf(dectinary, dectinary.length-1);
		part2=dectinary[dectinary.length-1];
		swapPart1backToFront= part1.length-1;
		part1position=0;
	}
	public static void main(String[] args) {

	//	new Permutation().callMe();
		String [] dec = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		new Permutation(dec).callMe();
	}
	public void callMe() {
		// swap part1[position] with part2
		// position++
		for (int x = 0;x<part1.length+1;x++)
		{
			//
			for (int i = 0;i<part1.length;i++)
			{
				// loop and print each index of part1
				// print part2  
				// swap part1[lastIndex] with part1[lastIndex-1]
				// lastIndex--
				for (int j =0;j<=part1.length; j++)
				{
					String [] startValue = Arrays.copyOf(part1, part1.length);
					System.out.print(counter + " ");
					for (String s : part1)
					{
						System.out.print(s);
						
					}
					
					System.out.println(part2);
					counter ++;
					if (swapPart1backToFront>0)
					{
						String temp = part1[swapPart1backToFront];
						part1[swapPart1backToFront]=part1[swapPart1backToFront-1];
						part1[swapPart1backToFront-1]=temp;
						swapPart1backToFront--;
					}
					else 
					{
						break;
					}
					if (part1position<part1.length)
					{
						String temp = part2;
						part2 = part1[part1position];
						part1[part1position]=temp;
					}
						if (Arrays.deepEquals(startValue, part1))
						{
							Arrays.asList(part1);

							break;
						}
				}
				swapPart1backToFront= part1.length-1;



			}

			part1position++;

		}
			
	}
}
