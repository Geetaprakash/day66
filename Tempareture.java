import java.util.Scanner;
public class Tempareture
{
  public static void main(String[] args) 
  {
	  Scanner utility= new Scanner(System.in);
	  boolean flag = true;
	  String in;
	  System.out.println("Enter the tempareture which do you want to convert into celsius to fahrenheit");
	  in=utility.next();
	  while(flag)
	  {
		  if (utility.isNumber(in) )
		  {
			  flag = false;
		  }
		  else
		  {
			  System.out.println("Enter the Correct type of tempareture");
			  in=utility.next();
		  }
	  } 
		  double temp=Double.parseDouble(in);
		  System.out.println("Fahrenheit Temp: " + utility.celsiusToFahrenheit(temp));
		  
		  boolean flag1=true;
		  String in1;
		  System.out.println("Enter the tempareture which do you want to convert into fahrenheit to celsius");
		  in1=utility.next();
		  while(flag1)
		  {
			  if (utility.isNumber(in1) )
			  {
				  flag1=false;
			  }
			  else
			  {
				  System.out.println("Enter the Correct type of tempareture");
				  in1=sc.next();
			  }
		  } 
			  double temp1=Double.parseDouble(in1);
			  System.out.println("ceslsius Temp: " + utility.fahrenheitToCelsius(temp1));
	  }
  }