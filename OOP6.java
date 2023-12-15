/*Aim : Exception handling
Implement a program to handle Arithmetic exception,
Array Index Out Of Bounds. The user enters two numbers
Num1 and Num2. The division of Num1 and Num2 is
displayed. If Num1 and Num2 were not integers, the
program would throw a Number Format Exception. If
Num2 were zero, the program would throw an Arithmetic
Exception. Display the exception.*/

//***********ExceptionDemo.java*********
import java.util.Scanner; public
class ExceptionDemo
{
int num1,num2,div;
Scanner sc=new Scanner(System.in); public
void divByZero()
{
System.out.println ("Enter First Number :");
num1=Integer.parseInt(sc.next());
System.out.println ("Enter second Number :");
num2=Integer.parseInt(sc.next()); div=num1/num2;
System.out.println ("Result: " + div);
}
public void arrayIndexOutofBound()
{
int n;
System.out.println ("Enter Array Size:");
n=sc.nextInt(); int a[]=new int[n]; for(int
i=0; i<=n; i++)
{
System.out.println ("Enter Element"+i+" :");
a[i]=sc.nextInt();
} }
public static void main(String[] args)
{
ExceptionDemo d=new ExceptionDemo();
try
{
d.divByZero();
d.arrayIndexOutofBound(); }
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println ("Array index out of Bound exception occured");
}
catch(NumberFormatException e)
{
System.out.println ("Number format exception occured");
}
catch(ArithmeticException e)
{
System.out.println ("Arithmetic Exception occured");
}
catch(Exception e)
{
System.out.println ("Exception occured");
}
System.out.println ("Out of try-catch block..");
}
}
