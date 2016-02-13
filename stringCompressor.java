import java.util.Arrays;

class Untitled {
	public static void main(String[] args) {
		int[][] matrix = {{1,2},{3,4},{3,4}};
		rotateInPlace(matrix, 3);
	}
	
	public static int[][] matrixRotator(int[][] matrix, int rotator){
		int n = matrix.length;
			for (int i = 0; i < n / 2; i++) {
				for (int j = 0; j < Math.ceil(n / 2); j++) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[n-1-j][i];
					matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
					matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
					matrix[j][n-1-i] = temp;
				}
			}
		
		for (int x = 0; x < n ;x++) {
			System.out.println(Arrays.toString(matrix[x]));
		}

		return matrix;
	}
	
	public static void rotation( int [][] matrix, int n )
        {
            int start = 0, end = n - 1;
            int temp = 0;
            //save left vertical line to temp and rotate 90 degree line by line
            while( start < end ){
                for( int i = 0; i < end - start; i++ )
                {
                    temp = matrix[ start ][ start + i ];
                    matrix[ start ][ start + i ] = matrix[ end - i ][ start ];
                    matrix[ end - i ][ start ] = matrix[ end ][ end - i ];
                    matrix[ end ][ end - i ] = matrix[ start + i ][ end ];
                    matrix[ start + i ][ end ] = temp;
                }
                start++;
                end--;
            }   
			for (int x = 0; x < n ;x++) {
				System.out.println(Arrays.toString(matrix[x]));
			}
        }

    static void rotateInPlace(int[][] matrix, int n) {
        for (int layer = 0; layer < n/2; ++layer) {
            for (int i = layer; i < n - 1 - layer; ++i) {
                // save top
                int tmp = matrix[layer][i];
                
                // left to top
                matrix[layer][i] = matrix[n - 1 - i][layer];
                
                // bottom to left
                matrix[n - 1 - i][layer] = matrix[n - 1 - layer][n - 1 - i];
                
                // right to bottom
                matrix[n - 1 - layer][n - 1 - i] = matrix[i][n - 1 - layer];
                
                // top to right
                matrix[i][n - 1 - layer] = tmp;
            }
        }
    }

}