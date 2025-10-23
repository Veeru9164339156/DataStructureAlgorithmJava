package TwoDArray2DArray;
import java.util.Scanner;
public class SubMatrixusingMethod {
public static void main(String[] args) {
	System.out.println("read first matrix");
	int[][] a=readMat();
	System.out.println("read second matrix");
	int[][] b=readMat();
	System.out.println("user enterd first matix");
	displayMat(a);
	System.out.println("user enterd second matix");
	displayMat(b);
	
	int[][] c=subMat(a,b);
	if(c==null)
		System.out.println("Substraction failed");
	else {
		System.out.println("Substracted matix");
		displayMat(c);
	}
}
static int[][]readMat(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the order of matrix");
	int r=sc.nextInt();
	int c=sc.nextInt();
	int[][] mat=new int[r][c];
	System.out.println("enter"+r*c+"values row wise");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			mat[i][j]=sc.nextInt();
		}
	}
	return mat;
}
static void displayMat(int[][]mat)
{
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			System.out.print(mat[i][j]+" "); 
		}
		System.out.println();
	}
}
static int[][]subMat(int[][]x,int[][]y)
{
	if(x.length !=y.length||x[0].length !=y[0].length)
		return null;
	int[][]z=new int[x.length][x[0].length];
			for(int i=0;i<z.length;i++)
			{
				for(int j=0;j<z[i].length;j++)
				{
					z[i][j]=x[i][j]-y[i][j];
				}
			}	
	return z;
}
}
