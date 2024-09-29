import java.util.*;
class electricityBill
{
    String ConsumerNo;
    String ConsumerName;
    double currentreading;
    double previousreading;
    double bill=0;
    String connectiontype;
    electric()
    {
        Scanner sc=new Scanner(System.in);
        ConsumerNo=sc.nextLine();
        ConsumerName=sc.next();
        currentreading=sc.nextDouble();
        previousreading=sc.nextDouble();
        connectiontype=sc.next();
    }
    void display()
    {
        System.out.println("Consumer number: "+ConsumerNo);
        System.out.println("Consumer name: "+ConsumerName);
        System.out.println("Current reading: "+currentreading);
        System.out.println("previous reading: "+previousreading);
        System.out.println("Connection type: "+connectiontype);
    }
    void bill()
    {
      double domestic=5.0;
      double commercial=8.0;
      double units=currentreading-previousreading;
      if(connectiontype.equals("domestic"))
      {
        
        System.out.println(units*domestic);
      }
      else if(connectiontype.equals("commercial"))
      {
        System.out.println(units*commercial);
      }
      else{
        System.out.println("wrong connection");
      }
        
    }
        
    public static void main(String s[])
    {
      
      electric e=new electric();
      e.display();
      e.bill();
    }
}