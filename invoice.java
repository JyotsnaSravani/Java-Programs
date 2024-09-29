import java.util.*;
class invoice
{
    String Number;
    String Description;
    int quantity;
    double price;
    invoice()
    {
        Scanner sc=new Scanner(System.in);
        Number=sc.nextLine();
        Description=sc.next();
        quantity=sc.nextInt();
        price=sc.nextDouble();
    }
    void getInvoiceAmount()
    {
        System.out.println(quantity*price);
    
    }
    public static void main(String[] args)
    {
        invoice i=new invoice();
        i.getInvoiceAmount();
    }
}