import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();//readInt first for how many cases u will loop throu
        for(int a0 = 0; a0 < t; a0++){
        	
            int n = in.nextInt();//readInt sec for how many days will be in that case
            int[] arr = new int[n];//read array for the number on sec
           
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int subVal = 0;
            int result =0;
            switch(a0){
            case 0:
            	subVal=arr[0]-arr[1];
            	result=arr[arr.length-1]-subVal;
            	System.out.println(result);            
            break;
            case 1:
            	for (int i=0;i<arr.length-1;i++)
            	{
         			result+=arr[i];
            	}
            		result=(arr[arr.length-1]-result)+arr[arr.length-1];
            		System.out.println(result);
            	
            break;
            case 2:
            	int halfArray = arr.length/2;
            	int firstPart=0;
            	int secPart = 0;
            	
            	for (int i=0;i<halfArray;i++) {
            	firstPart=arr[i]-firstPart;
            	}
            	for(int x=arr.length;x>halfArray;x--)
            	{
            		secPart=arr[x-1]-secPart;
            	}
            	result= firstPart-secPart;
            	System.out.println(result);
            break;
            
            }
        }
        in.close();
        

    }
   

}