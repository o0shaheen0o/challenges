/**
 * given a matric of '1's and '0's and 'x' 
 * where '1's are steps and '0's are miens and 'x'is a treasure  
 * find the shortest path to the treasure
 * u can move up,down,left,right
 * count the number of steps it takes to find the treasure
 * you can not step in miens '0'
 * you always start the search from the left top corner (index 0,0 in the matrix)
 * example1 :
 * [1,0,0]
 * [1,0,0]
 * [1,x,0] 
 *
 *it took 3 steps to find the treasure
 *
 *example 2
 * [1,1,1]
 * [0,0,1]
 * [1,x,1] 
 * 
 *  *it took 5 steps to find the treasure

 */


public class FindInMatrix {

	public static void main(String[] args) {
	    char c[][] = {{'1','1','0'},
	    		      {'0','1','0'},
                      {'0','x','0'}};

	    System.out.println(new FindInMatrix().startLookup(c) );
	}
	public int startLookup(char [][] matrix) {
		int counter =0;
		for (int i =0;i<matrix.length;i++) {
			for (int j=0;j<matrix.length;j++) {
				if (matrix[i][j]=='x') {
					return counter;
				}
				else if(matrix[i][j]=='1'){
					findPath(matrix, i, j,counter);
				}
			}
		}
		return counter;
	}
	public int  findPath(char [][]matrix,int i,int j,int counter)
	{
		counter ++;
		if ((i<0 ||j<0) ||
			(i==matrix.length || j==matrix.length) ||
			(matrix[i][j]=='0') ||
			(matrix[i][j]=='x'))
		{
			return counter;
		}
		else {
			findPath(matrix,i-1,j,counter);//left
			findPath(matrix,i+1,j,counter);//right
			findPath(matrix,i,j+1,counter);//bottom
			findPath(matrix, i, j-1,counter);//top
		}
		return counter;
		
	}

}
