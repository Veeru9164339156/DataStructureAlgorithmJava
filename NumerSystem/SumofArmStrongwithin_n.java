import java.util.Scanner;
class SumofArmStrongwithin_n
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the range");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
boolean rs=isArmStrong(i);
if(rs)
sum=sum+i;
}
System.out.println(sum);
}

static boolean isArmStrong(int n)
{
int dc=countDigits(n);
int sum=0,t=n;
do{
int d=n%10;
sum=sum+pow(d,dc);
n=n/10;
}while(n!=0);
return sum==t;
}

static int countDigits(int n)
{
int count=0;
do{
count++;
n=n/10;
}while(n!=0);
return count;
}

static int pow(int n,int p)
{
int prod=1;
while(p>0)
{
prod=prod*n;
p--;
}
return prod;
}

}
