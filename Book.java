import java.util.*;
class Book
{
    String bookname;
    String isbn;
    String author;
    String publisher;
    Book()
    {
        Scanner sc=new Scanner(System.in);
        bookname=sc.nextLine();
        isbn=sc.nextLine();
        author=sc.nextLine();
        publisher=sc.next();
    }
    void setbookname(String bookname)
    {
        this.bookname=bookname;
    }
    void setisbn(String isbn)
    {
        this.isbn=isbn;
    }
    void setauthor(String author)
    {
        this.author=author;
    }
    void setpublisher(String publisher)
    {
        this.publisher=publisher;
    }
   String getbookname()
   {
       return bookname;
   }
   String getisbn()
   {
       return isbn;
   }
   String getauthor()
   {
       return author;
   }
   String getpublisher()
   {
       return publisher;
   }
   String getbookinfo()
   {
       return("Bookname : "+bookname  + "ISBN : "+isbn  +"Author : "+author +  "publisher : "+publisher);
   }
   public static void main(String s[])
   {
       Book b=new Book();
       System.out.println("Book details : ");
       System.out.println(b.getbookinfo());
      
   }
   
    
}