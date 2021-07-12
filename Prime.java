import java.util.Scanner;   
public class Prime {  
  
   public static void main(String[] args) {  
       Scanner primenum = new Scanner(System.in); 
	int n; 
       System.out.print("ENTER A NUMBER : ");  
       n = primenum.nextInt();  
       if (isPrime(n)) {  
           System.out.println(n + " IS PRIME NUMBER");  
       } else {  
           System.out.println(n + " IS NOT PRIME NUMBER");  
       }  
   }  
  
public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= n/2; i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}  