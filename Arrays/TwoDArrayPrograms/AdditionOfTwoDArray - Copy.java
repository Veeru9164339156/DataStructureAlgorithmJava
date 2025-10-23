package TwoDArray2DArray;
//ADD tow matrix 
public class AdditionOfTwoDArray {
public static void main(String[] args) {
	int [][] ar1= {{1,2,3},{3,2,4},{5,2,5}};
	int [][] ar2= {{2,4,5},{4,4,3},{4,2,3}};
	System.out.println("Before adding"
			+ "");
	System.out.println("first matrix");
	for(int i=0;i<ar1.length;i++)
	{
		for(int j=0;j<ar1[i].length;j++)
		{
			System.out.print(ar1[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("second matrix");
	for(int i=0;i<ar2.length;i++)
	{
		for(int j=0;j<ar2[i].length;j++)
		{
			System.out.print(ar2[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("after adding ");
	for(int i=0;i<ar1.length;i++) {
		for(int j=0;j<ar2.length;j++)
		{
			System.out.print(ar1[i][j]+ar2[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
