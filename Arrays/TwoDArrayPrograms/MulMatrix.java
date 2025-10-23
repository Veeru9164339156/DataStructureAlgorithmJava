package TwoDArray2DArray;

public class MulMatrix {
	public static void main(String[] args) {
		int [][] ar1= {{1,2,3},{3,2,4},{5,2,5}};
		int [][] ar2= {{2,4,5},{4,4,3},{4,2,3}};
		System.out.println("Before multiplication"
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
		System.out.println("after multiplying ");
		int [][]ar3=mulMat(ar1,ar2);
		for(int i=0;i<ar3.length;i++)
		{
			for(int j=0;j<ar3[i].length;j++)
			{
				System.out.print(ar3[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int[][]mulMat(int[][]a,int[][]b){
		if(a.length!=b.length||a[0].length!=b[0].length) 
			return null;
		int [][]c=new int[a.length][a[0].length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]*b[i][j];
			}
		}
		return c;
	}
	

}
