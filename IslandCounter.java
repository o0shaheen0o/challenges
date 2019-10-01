

/*
 * on a given matrix count the islands
 * given that '1's is land and '0' is water and
 * outside the matrix is consider to be water '0'
 * example 
 * [1,1,1],
 * [0,0,1],
 * [1,0,1]
 * has 2 islands 
 * [1,1,1]
 * [    1]
 * [    1]
 *     and 
 * [     ]
 * [     ]
 * [1    ]
 */

public class IslandCounter {
	
	public static void main (String args[])
	{
	    char c[][] = {{'1','1','0'},
	                  {'0','1','0','1'},
	                  {'0','0','0'}};
	
	    System.out.println(new IslandCounter().numIsland(c));
	}
	public int numIsland (char[][] grid)
	{
	    int counter =0;
	    for (int i = 0;i<grid.length;i++ )
	    {
	        for (int j=0;j<grid[i].length;j++)
	        {
	            if(grid[i][j]=='1')
	            {
	                checkNeighbors(grid,i,j);
	                counter++;
	            }
	
	        }
	    }
	    return counter;
	}
	private void checkNeighbors(char[][]grid,int i ,int j){
	
	    if ((i<0 ) ||  (j<0)      || // order of the if statement is important else u will get arrayoutbound
	        (i==grid.length)      ||
	        (j==grid[0].length)   ||
	        (grid[i][j]=='0' ))
	            {
	                return;
	            }
	
	    grid[i][j]='0';
	    checkNeighbors(grid,i-1,j);//left
	    checkNeighbors(grid,i+1,j);//right
	    checkNeighbors(grid,i,j+1);//bottom
	    checkNeighbors(grid, i, j-1);//top
	}

}