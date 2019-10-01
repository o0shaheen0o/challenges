
public class Permutation2 {

	int part1position;
	int swapPart1backToFront;
	String part1 [] = new String[5];

	String part2 ;
	
	public Permutation2() {
		part1[0]="A";
		part1[1]="B";
		part1[2]="C";	
		part1[3]="D";
		part1[4]="E";
		part2 = new String("F");
		swapPart1backToFront= part1.length-1;
		part1position=0;
	}
	public static void main(String[] args) {

		new Permutation2().callMe();
	}
	public void callMe() {

		for (int x = 0;x<part1.length+1;x++)
		{
			for (int i = 0;i<part1.length;i++)
			{
				for (int j =0;j<part1.length-1; j++)
				{
					for (String s : part1)
					System.out.print(s);
					System.out.println(part2);
					String temp = part1[swapPart1backToFront];
					part1[swapPart1backToFront]=part1[swapPart1backToFront-1];
					part1[swapPart1backToFront-1]=temp;
					swapPart1backToFront--;
				}
				swapPart1backToFront= part1.length-1;
				
			}
			if (part1position<part1.length)
			{
				String temp = part2;
				part2 = part1[part1position];
				part1[part1position]=temp;
				part1position++;
			}
			
		}
			
	}
}
