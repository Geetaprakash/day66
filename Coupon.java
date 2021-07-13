import java.util.Scanner;
public class Coupon 
{
	public static void main(String[] args) 
	{
		Scanner co=new Scanner(System.in);
		int dis=1;
		int cou=0;
			System.out.println("ENTER THE COUPON NUMBERS");
			int n=co.nextInt();
			
			int[] collec=new int[n];

			while(dis<=n)
			{
				int val=(int) (Math.random()*n);
				cou++;
				System.out.println("value " +(val+1));
				if(collec[val]!=val+1)
				{
					dis++;
					collec[val]=val+1;
				}
						
			}

System.out.println("TOTAL NUMBERS TO GET "+n+" DIFFERENT COUPON NUM ARE " +cou);
System.out.println(" ");
System.out.println("ARRAY ");
System.out.println(" ");
for (int i=0;i<n;i++)
System.out.println(i+ " ARRAY ELEMENTS ARE " +collec[i]);
}
}