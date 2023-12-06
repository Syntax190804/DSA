class Complex_Op
{
 float real , imag ;
 Complex_Op() // Default Constructor
 {
 real = 0 ;
 imag = 0 ;
 }

 Complex_Op(float Comp1 , float Comp2) //Parameterized Constructor
 {
 real = Comp1 ;
 imag = Comp2 ;
 }
 public void AddNumbers(Complex_Op C1 , Complex_Op C2)
 {
 float real , imag ;
 real = (C1.real + C2.real) ;
 imag = (C1.imag + C2.imag) ;
 System.out.println("Addition is :("+real+") + ("+imag+")i");
 }
 public void SubNumbers(Complex_Op C1 , Complex_Op C2)
 {
 float real , imag ;
 real = (C1.real - C2.real) ;
 imag = (C1.imag - C2.imag) ;
 System.out.println("Subtraction is :("+real+") + ("+imag+")i");
 }
 public void MulNumbers(Complex_Op C1 , Complex_Op C2)
 { //(a+ib)(c+id) = (ac-bd) + i(ad+bc)
 float real , imag ;
 real = (C1.real * C2.real) - (C1.imag * C2.imag) ;
 imag = (C1.imag * C2.real) + (C1.real * C2.imag) ;
 System.out.println("Multiplication is :("+real+") + ("+imag+")i");
 }
 public void DivNumbers(Complex_Op C1 , Complex_Op C2)
 {
 float real , imag ;
 float den ;
 den = C2.real * C2.real + C2.imag *C2.imag ;
 real = ((C1.real * C2.real) + (C1.imag * C2.imag)) /den ;
 imag = ((C1.imag * C2.real) - (C1.real * C2.imag)) /den ;
 System.out.println("Division is :("+real+") + ("+imag+")i");
 }
}
/****************************************************2.Complex.java********

import java.util.Scanner ;
public class Complex
{
 public static void main(String args[])
 {
 int ch = 0 , m ;
 char n ;
 float num1 , num2 , answer ;
 Complex_Op cal = new Complex_Op () ;
 Scanner input = new Scanner(System.in) ;
 System.out.print("Enter the first no.\n ");
 num1 = input.nextInt(); //Real part
 num2 = input.nextInt(); //Imaginary part
 Complex_Op Object1 = new Complex_Op(num1 , num2) ;
 System.out.print("Enter the second no.\n ");
 num1 = input.nextInt(); //Real part
 num2 = input.nextInt(); //Imaginary part
 Complex_Op Object2 = new Complex_Op(num1 , num2);
 do
 {
 System.out.print("\nMenu:
\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nEnter Your Choice
= ") ;
 m = input.nextInt() ;
 switch(m)
 {
 case 1 : cal.AddNumbers(Object1,Object2) ;
break ;
 case 2 : cal.SubNumbers(Object1,Object2) ;
 break ;
 case 3 : cal.MulNumbers(Object1,Object2) ;
 break ;
 case 4 : cal.DivNumbers(Object1,Object2) ;
break ;
 }
 System.out.print("\nDo you want to continue-y/n : ") ;
 n = input.next().charAt(0) ;
 } while (n == 'y') ;
 }
} */