import java.util.*;
class calculator
{
    public static void main(String s[])
    {
        int a,b;
        char op;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b,op: ");
        a=sc.nextInt();
        b=sc.nextInt();
        op=sc.next().charAt(0);
        switch(op)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
            System.out.println("Invalid operator");
        }
        try
        {
            int c=a/b;
        }
        catch(Exception e1)
        {
            System.out.println("indefinite");
        }
    }
}