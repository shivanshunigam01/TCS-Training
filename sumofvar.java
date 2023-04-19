import java.util.Scanner;

public class sumofvar {

    public static void  sumOfDigits() {
     System.out.println("This program will help you to add the digits of the number:");
double number, digit, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the digits: ");  
number = sc.nextDouble();  
while(number > 0 ||number<0)  
{  
   
digit = number % 10;  //seperate

sum += digit;  
  
number = number / 10;  
}  

//prints the result  
System.out.println("Sum of Digits: "+sum);  
}  


public static void addthreevar() {

double a,b,c=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("This program will help you to add three numbers");
   
    System.out.println("Enter the number one:");
     a=sc.nextDouble();

    
    System.out.println("Enter the number two:");
     b=sc.nextDouble();

    
    System.out.println("Enter the number three:");
     c=sc.nextDouble();

    double answer=a+b+c;

    System.out.println("The addition of three numbers is:"+answer);    
}
 
    public static void main(String[] args) {
       //clear addthreevar();
        sumOfDigits();
    }
   
}
