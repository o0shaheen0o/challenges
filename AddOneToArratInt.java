
public class AddOneToArratInt {

	public static void main(String[] args) {
		int [] array = {1,1,1};
		int arrayToint = 0;
		for (int i : array)
		{
			arrayToint = arrayToint*10+i;
		}
		System.out.println(arrayToint+1);
	}

}
