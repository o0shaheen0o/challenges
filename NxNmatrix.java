
public class NxNmatrix {

	static int [][] matrix;
	int count;


	public static void main(String[] args) {
		NxNmatrix	nxn = new NxNmatrix();
		nxn.createMatrix();
		nxn.rotate();
		nxn.rotate(matrix,4);
		nxn.print();

	}

	private void print() {
		for(int i []: matrix) {
			System.out.println();
			for (int h :i) {
				System.out.print(h + " \t");
			}
		}
	}

	private void createMatrix() {
		matrix = new int  [4][4];
		for(int i=0; i<matrix.length;i++) {
			System.out.println();
			for(int h=0; h<matrix.length;h++) {
				matrix[i][h]= count++;
				System.out.print(matrix[i][h] + " \t");
			}
		}
		System.out.println();
	}//end of create

	private void rotate() {
		int [] tempRight= new int [4];
		int [] tempLeft = new int [4];
		int [] tempTop = new int [4];
		int [] tempBottom = new int [4];

		for (int i =0; i<matrix.length; i++) {
			System.out.println();
			for(int h=0;h<matrix.length;h++) {
				tempRight [h]=matrix[h][matrix.length-1];
				tempLeft[h]=matrix[h][0];
			}			
			for (int h=0;h<matrix.length;h++) {
				tempTop[h]= matrix[0][h];
				tempBottom[h]= matrix[matrix.length-1][h];
			}
			for (int h=0;h<matrix.length;h++) {
				matrix[0][h]=tempRight[h];
				matrix[matrix.length-1][h]=tempBottom[h];
				matrix[h][0]=tempTop[h];
				matrix[h][matrix.length-1]=tempLeft[h];
			}
		}

		for (int h=0;h<matrix.length;h++) {
			System.out.println(tempTop[h] + " \t" + tempBottom[h]+ " \t" + tempLeft[h]+ " \t" + tempRight[h]);	

		}

	}

	
	//method from crack the code .. {it is not working }
		public void rotate(int[][] matrix, int n) {
			for (int layer = 0; layer < n / 2; ++layer) {
				int first = layer;
				int last = n - 1 - layer;
				for(int i = first; i < last; ++i) {
					int offset = i - first;
					// save top
					int top = matrix[first][i];
	
					// left -> top
					matrix[first][i] = matrix[last-offset][first];
	
					// bottom -> left
					matrix[last-offset][first] = matrix[last][last - offset];
	
					// right -> bottom
					matrix[last][last - offset] = matrix[i][last];
	
					// top -> right
					matrix[i][last] = top;
				}
			}
		}

	}
