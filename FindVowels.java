/*
 * how to find a char in a string or how to find vowels in a string 
 * 2 ways below the conventient want with the if statment 
 * and the way i came up with by adding the all the vowels to a string and test for the indexof it returns -1 then the vowel is not in the word
 * or it will return the indexof the vowel 
 */
public class FindVowels {

	public static void main(String[] args) {

		
		
		String sentence = "hello there find the first vowels on each word";
		
		String breakSentence [] = sentence.split(" ");

		for (String s : breakSentence)
		{
			String vowels = "aeiouyAEIOUY";// put all the vowels in a word 

			for (char c : s.toCharArray())
			if (vowels.indexOf(c)>=0)// indexOf will return -1 if the char is not in the vowels word other wise it  will return the index of the char
							// in this case we test if the int returned from indexOf is > 0 it means the letter is in the vowels word and it is a vowel
			{
				System.out.print(c + " " +s.indexOf(c));
				
				break;
			}
			System.out.println();
		}

		
		
		for (String s : breakSentence)
		{
			for (char c : s.toCharArray())
			{
				if (c=='a' || c =='A'  || c=='e' || c=='E' || c=='i' || c =='I' || c== 'o' || c=='O' || c=='u' || c =='U' || c=='y' || c=='Y')
				{
					System.out.println(c + " " + s.indexOf(c));
				}
			}
		}
		
	}

}
