import java.util.Scanner;
public class Payment
{
	double m;
	Payment(double p,double r,double t)
	{  
      	m= (p * r) / (1 - Math.pow(1 + r, -t));
	m= Math.round(m* 100) / 100;
	}

	public static void main(String[] arg)
	{
	Scanner scan = new Scanner(System.in); 
      	System.out.print("Enter Principal Amount : ");
      	double a = scan.nextDouble(); 
      	System.out.print("Enter Rate of Interest : ");
      	double b = scan.nextDouble(); 
      	b= (b/100)/12; 
      	System.out.print("Enter Time period in years :");
      	double c = scan.nextInt();
      	c= c*12;
	Payment pay = new Payment(a,b,c);
	System.out.println("Payment: " + pay.m);
	}
}