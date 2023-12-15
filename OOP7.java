/*Aim : Generic Program
Implement a generic program using any collection class
to count the number of elements in a collection that have
a specific property such as even numbers, odd number,
prime number and palindromes.*/

//*******A7.java***********
import java.util.*;
import java.lang.*;
import java.io.*; public
class A7
{
static int count =0;
static void check_palindrome(String x)
{
StringBuilder s1 = new StringBuilder(x); if
(x.equals(s1.reverse().toString()))
{
System.out.println(x + " is a palindrome");
count += 1;
} else
{
System.out.println(x + " is not a palindrome");
} }
static void even_odd(int x)
{ if(x % 2 ==
0)
{
System.out.println(x + " is Even");
count +=1;
} else
{
System.out.println(x + " is odd");
} }
static void prime(int x)
{ boolean flag = false;
for(int i=2; i<=x/2; ++i)
{ if(x%i ==
0) { flag =
true; break;
} } if (!flag)
{
System.out.println(x + " is prime number"); count += 1; }
else
{
System.out.println(x + " is not prime number");
} }
static void check(int ch,int x)
{
switch(ch)
{ case 1:
even_odd(x);
break; case
2: prime(x);
break;
default:
System.out.println("enter correct option ");
} }
static void number_op()
{
int element,n,choice;
Scanner sc = new Scanner(System.in);
ArrayList<Integer> nums = new ArrayList<Integer>();
System.out.println("Enter the number of element: ");
n=sc.nextInt();
System.out.println("Enter the elements ");
for(int i=0; i<n; i++)
{ element
=sc.nextInt();
nums.add(element);
}
System.out.println("Enter the operation to be performed");
System.out.println("1.ODD or EVEN");
System.out.println("2. PRIME or NOT");
choice = sc.nextInt(); Iterator
itr = nums.iterator();
count = 0; while(itr.hasNext())
{
check(choice,(int)itr.next());
}
if(choice == 1)
{
System.out.println("The numbers of even numbers is: "+
count);
System.out.println("The numbers of odd numbers is: "+
(nums.size()-count));
} else
{
System.out.println("The number of prime number is: "+
count);
System.out.println("The Number of Non prime number is:"+(nums.size()-count));
} }
static void String_op()
{
int n;
String word;
ArrayList<String> words = new ArrayList<String>();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no.of elements: "); n =
sc.nextInt();
System.out.println("Enter the elements ");
for(int i=0; i<n; i++)
{ word =
sc.next();
words.add(word);
} count = 0;
for(String w:words)
{
check_palindrome(w);
}
System.out.println("the no.of palindrome is: "+ count);
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("choose type");
System.out.println("1. String");
System.out.println("2. Integer");
int ch = sc.nextInt();
if(ch == 2)
number_op();
else String_op();
}
} 
