package TwoDArray2DArray;

public class RowWiseReverse {
public static void main(String[] args) {
	int[][]mat= {{1,2,4,5},{2,5,6,4},{6,5,4,7},{7,6,5,3}};
	System.out.println("Bofore reverse");
	disp(mat);
	System.out.println("After reverse");
	rowWiseReverse(mat);
	disp(mat);
	
}
static void rowWiseReverse(int mat[][]) {
	for(int i=0;i<mat.length;i++) {
		int f=0,l=mat[i].length-1;
		while(f<l) {
			int t=mat[i][f];
			mat[i][f]=mat[i][l];
			mat[i][l]=t;
			f++;
			l--;
			}
	}
}
static void disp(int [][]mat) {
	for(int i=0;i<mat.length;i++) {
		for(int j=0;j<mat[i].length;j++) {
			System.out.print(mat[i][j]+" ");
		}
		System.out.println();
			
	}
}
}
