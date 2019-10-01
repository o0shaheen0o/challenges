import javax.swing.JOptionPane;

public class mergeInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {2,4,5,11,35,55,66,77,0,0,0,0,0,0};
		int []b	=        {1,3,6,8,22,34};
		
	//	merge(a,b);// thow an exception
		mergeInPlace(a, b);//exception is be solved
	}

	private static void merge(int[] a, int[] b) {// throw an exception that is been solved in the mergerInPlace method
		int aI = a.length-1;
		int bI = b.length-1;
		int posI=a.length-b.length-1;
		
	
		while (aI>=0 ) {
			if(a[posI]> b[bI]) {//missing the test for posI>=0 see mergeInPlace(int a[],int b[])
				a[aI]=a[posI];
				posI--;	
			}
			else {

				a[aI]=b[bI];
				bI--;

			}
			aI--;
		}
		
		for (int x:a) {
			System.out.println(x);
		}
	}
	public static void mergeInPlace(int[] a, int[] b) {
		int aI = a.length-1;
		int bI = b.length-1;
		int posI=a.length-b.length-1;
		
	
		while (aI>=0 ) {
			if(posI>=0&&a[posI]> b[bI]) {// the posI>=0 was the problem in the above method(
										//posI was going to -1 and it would throw an exception
				a[aI]=a[posI];         //by adding the posI>=0 condition control will go to the else and the last index will be added 
				posI--;	
			}
			else {

				a[aI]=b[bI];
				bI--;

			}
			aI--;
		}
		
		for (int x:a) {
			System.out.println(x);
		}
	}

}
