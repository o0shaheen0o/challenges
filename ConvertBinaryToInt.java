// convert the binary to an int and for the result 
// while the result is > 0 .. divide by 2 if even"s,4,6,.." number and subtract 1"-1" if odd number"1,3,5,..."
// give the number of operations took to reach 0
public class ConvertBinaryToInt {
	
	public static void main (String []agrs)
	{
        int n = Integer.parseInt("011100",2);// convert a binary to an int using Integer.parseInt(String,int)
        System.out.println(n);
        int count =0;
        if (n%2==0)
        while (n>0)
        {
            if (n%2==0)
            {
            	n=n/2;
            	count++;
            }
            else
            {
        		n=n-1;
        		count++;
            }
        }       
        System.out.println(count);
	}

}
