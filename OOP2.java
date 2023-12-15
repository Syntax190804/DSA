/*Aim : Identify commanalities and differences between Publication, Book, and Magazine classes. Title,
Prices, Copies, are common instance variables and salecopy is common method. The differences are,
Book class has author and OrderCopies(). Magazine class has orderqty , Currentissue, recieveissue().
Objective : To learn concept of polymorphism.*/
public class Publication
{
 public String title ;
 public double price ;
 public int copies ;
 //Default constructor to assign data member
 public Publication()
 {
 this.title = null ;
 this.price = 0 ;
 this.copies = 0 ;
 }
 public Publication(String title , double price , int copies)
 {
 this.title = title ;
 this.price = price ;
 this.copies = copies ;
 }
 public void sellcopy (int qty)
 {
 System.out.println("Total publication sell : Rs." + (qty*price));
 }
}
public class Book extends Publication
{
 private String author ;
 //Define constructor to assign data member
 public Book ()
 {
 super() ;
 this.author = null ;
 }
 public Book (String title , double price , int copies , String author)
 {
 super(title , price , copies) ;
 this.author = author ;
 }
 //methd sellcopy() of superclass publication is overridden
 public void sellcopy (int qty)
 {
 System.out.println("Total Book sell : Rs. " + (qty * price));
 }
}
public class Magazine extends Publication
{
 private int orderqty ;
 private String currIssue ;
 //Define constructor to assign data member
 public Magazine (String title , double price , int copies , int orderqty , String currIssue)
 {
 super (title , price ,copies) ;
 this.orderqty = orderqty ;
 this.currIssue = currIssue ;
 }
 //method sellcopy() of superclass Publication is overridden
 public void sellcopy(int qty)
 {
 System.out.println("Total Magazine sell : Rs. " + (qty * price));
 }
}
public class Mainclass
{
 public static void main(String[] args)
 {
 Publication obj = new Publication ("Java" , 200 , 5) ;
 obj.sellcopy(12) ;
 Publication obj1 = new Book ("Java" , 200 ,5 ,"James Gasolin") ;
 obj1.sellcopy(23) ;
 Publication obj3 = new Magazine ("Java" , 200 , 5 , 6 , "Sept") ;
 obj3.sellcopy(34) ;
 }
} 
