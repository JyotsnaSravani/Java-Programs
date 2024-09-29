class primeFib
{
    static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else if(n<=3)
        {
            return true;
        }
        else if(n%2==0 || n%3==0)
        {
            return false;
        }
        for(int i=5;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String s[])
    {
        int limit=100000;
        System.out.println("Prime fibonacci below  "+limit + ": ");
        int a=0,b=1;
        while(a<limit)
        {
            if(isprime(a))
            {
                System.out.println(a);
            }
            int temp=a+b;
            a=b;
            b=temp;
        }
        
    }
    
}