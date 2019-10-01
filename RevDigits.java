/*
 * 
IntroductionA simple way to generate numeric palindromes is the “reverse and add” method. 
Start with a positive integer, reverse the digits, and add it to the original number. 
If the result is not a palindrome (a sequence that is identical right-to-left and left-to-right), 
then repeat the process. For example, starting with 195 we add 591 (the reverse of the digits)to get 786,
 which is not a palindrome. Then we add 786 and 687 to get 1473, which is also not a palindrome. 
 Then 1473 plus 3741 yields 5214, and 5214 plus 4125 yields 9339. The number 9339 is a palindrome,
  so we're done!As a matter of fact, there are some rare numbers for which this process never yields a palindrome.
   For the purposes of this problem, you can assume that all input will yield a palindrome

 */
/*************************************************************************
palindrome (a sequence that is identical right-to-left and left-to-right)
***************************************************************************/
public class RevDigits {
  
  public static void main (String[] args) {
	  int [] solve = {195,304,628,570,259};
	  for (int i : solve) {
		  getPalindrome(i);
	}
    
    
  }
  
  
  // https://www.dropbox.com/s/8942rom2hrnch5l/Palindrome.pdf?dl=0

  static int getPalindrome(int x) {
	  int rev =getRev(x);
	  int addRev=rev+x;
	if (testPalindrome(addRev)) {
		System.out.println(addRev);

		return addRev;	  
	}
	else {
		getPalindrome(addRev);
	}
	return -1;
  }
  static int  getRev(int value){
    int result = 0;
    while (value>0) {
    	int lastDigit= value%10;
    	value=value/10;
    	result=	(result*10)+lastDigit;
      }
    
    return result;
  }
 
  static boolean testPalindrome(Integer value){
	  
	  return getRev(value)==value;
    
  }
    
}