class pangram
{
    public static void main(String s[])
    {
        String str = "the quick brown for jumps over the lazy dog";
        int a[] = new int[26];
        for(int i=0;i<26;i++)
        {
            a[i]=0;
        }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
               int pos=str.charAt(i)-97;
               a[pos]=1;
            }
        }
        int ispangram=1;
        for(int i=0;i<26;i++)
        {
            if(a[i]==1)
            {
              continue;
            }
            else
            {
               ispangram=0;
            }
        }
        if(ispangram==1)
        {
            System.out.println("pangram");
        }
        else
        {
           System.out.println("not a pangram");
        } 
    
}
}