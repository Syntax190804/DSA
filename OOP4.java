/*Aim : - To Study Polymorphism using Java.
Problem Statement:- Design a base class shape with two double type values
and member functions to input the data and compute_area() for calculating
area of figure. Derive two classes’ triangle and rectangle. Make compute_area()
as abstract function and redefine this function in the derived class to suit their
requirements. Write a program that accepts dimensions of triangle/rectangle
and display calculated area. Implement dynamic binding for given case study.*/
//*******************Shape.java*******************
import java.util.Scanner ;
public abstract class Shape {
 double height , width ;
public double getHeight() {
 return height ;
 }
public void setHeight(double height){
 this.height = height ;
}
public double getWidth() {
 return width ;
 }
 public void setWidth(double width) {
 this.width = width ;
}
 void input () {
 Scanner sc = new Scanner(System.in) ;
 System.out.println("Enter height : ");
 height = sc.nextDouble() ;
 System.out.println("Enter width : ");
 width = sc.nextDouble() ;
}
 public abstract double compute_area() ;
}
//**********************Rectangle.java*****************
public class Rectangle extends Shape {
 double area ;
 //Override
 public double compute_area() {
 height = this.getHeight() ;
 width = this.getWidth() ;
 area = height * width ;
 return area ;
 }
}
//**********************Triangle.java*********************
public class Triangle extends Shape {
 double area ;
 //Override
 public double compute_area() {
 height = this.getWidth() ;
 width = this.getWidth() ;
 area = (height * width)/2 ;
 return area ;
 }
}
//**********************Area.java*********************
public class Area {
 public static void main(String args[]) {
 double area ;
 Shape s ;
 Rectangle r = new Rectangle() ;
 s=r ;
 s.input() ;
 area = s.compute_area() ;
 System.out.println("Area of Rectangle : " +area);
 Triangle t = new Triangle() ;
 s=t ;
 s.input() ;
 area = s.compute_area() ;
 System.out.println("Area of Triangle : " +area);
 }
} 
