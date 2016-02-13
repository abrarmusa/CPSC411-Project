import java.util.Arrays;

class Untitled {
	public static void main(String[] args) {
		int[][] matrix = {
			{1,2,3,4},
			{0,5,6,7},
			{8,9,10,11},
			{12,13,14,0},
			{0,13,14,0}
		};
		System.out.println("Initial Matrix");
		for (int x = 0; x < matrix.length; x++){
			System.out.println(Arrays.toString(matrix[x]));
		};
		zeroMatrix(matrix);
		System.out.println("Final Matrix");
		for (int x = 0; x < matrix.length; x++){
			System.out.println(Arrays.toString(matrix[x]));

		};
	}
	
	public static int[][] zeroMatrix(int[][] matrix){
		boolean firstRowZero = false;
		boolean firstColZero = false;
		int rowLength = matrix.length;
		int colLength = matrix[0].length;
		
//		Check if first row has zeros. If true set zero boolean for row
		for (int i = 0; i < colLength; i++){
			if (matrix[0][i] == 0){
				firstRowZero = true;
				break;
			}
		}
//		Check if first column has zeros. If true set zero boolean for column
		for (int i = 0; i < colLength; i++){
			if (matrix[i][0] == 0){
				firstColZero = true;
				break;
			}
		}
//		Mark the zeros
		for (int i = 1; i < rowLength; i++){
			for (int j = 1; j < colLength; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		System.out.println("printing marked matrix");
		for (int x = 0; x < matrix.length; x++){
			System.out.println(Arrays.toString(matrix[x]));

		};
//		Replace with the zeros
		for (int i = 1; i < rowLength; i++){
			for (int j = 1; j < colLength; j++) {
				if (matrix[0][j] == 0 || matrix[i][0] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
//		Replace the first row with zeros
		
		if (firstRowZero) {
			for (int i = 0; i < colLength; i++) {
				matrix[0][i] = 0;
			}
		}
		
		if (firstColZero) {
			for (int i = 0; i < rowLength; i++) {
				matrix[i][0] = 0;
			}
		}

		return matrix;
		
		
	}
}