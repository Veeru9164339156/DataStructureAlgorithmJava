package arrayprograms;

public class NonCommonEle {
		public static void main(String[] args) {
			int []ar1= {2,3,5,8};
			int []ar2= {1,3,4,7,9};
			int []ar=nonCommonElements(ar1,ar2);
			for(int i=0;i<ar.length;i++)
			{
			System.out.println(ar[i]+" ");
			}
		}
		static int[] nonCommonElements(int []a,int []b)
		{
			int []c=new int[a.length+b.length];
			int k=0;
			for(int i=0;i<a.length;i++)
			{
				boolean rs=true;
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
					{
						rs=false;
						break;	
					}
				}
				if(rs)
					c[k++]=a[i];
			}
			for(int j=0;j<b.length;j++)
			{
						boolean rs=true;
						
						for(int i=0;i<a.length;i++)
						{
							if(b[j]==a[i])
							{
								rs=false;
								break;	
							}
						}
						if(rs)
							c[k++]=b[j];
			}
			int []rs=new int[k];
			for(int i=0;i<k;i++)
			{
				rs[i]=c[i];
			}
			return rs;	
		}

	}
