import java.util.*;
class interger_division
{
    public static void main(String s[])
    {
        String num1,num2;
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the numbers : ");
       num1=sc.next();
       num2=sc.next();
       try
       {
           int a=Integer.parseInt(num1);
           int b=Integer.parseInt(num2);
           int res=a/b;
           System.out.println("Result "+"=" + res);
       }
       catch(ArithmeticException e)
       {
           System.out.println("Denominator cannot be zero ");
       }
       catch(NumberFormatException e)
       {
           System.out.println("Only integers should be given as inputs ");
       }
        
    }
}