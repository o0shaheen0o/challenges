
public class Permutation3 {
	int counter=0;
	public static void main(String[] args) {
		String [] arr = {"A","B","C","D"};
		new Permutation3().permutation(arr);
	}
	public void permutation(String [] s)
	{
		for (int iii = s.length-1;iii>1;iii--)
		{
			for (int ii =0;ii<s.length;ii++)
			{
				for (int i =s.length-1;i>1;i--)
				{
					if (i>0)
					{
						System.out.print(counter++ + "\t");
						for (String r : s)
						{
							System.out.print(r);

						}

						System.out.println();
						String temp = s[i];
						s[i]=s[i-1];
						s[i-1]=temp;
					}


				}

			}
			String tempiii = s[iii];
			s[iii]=s[iii-1];
			s[iii-1]=tempiii;
		}


	}

}
