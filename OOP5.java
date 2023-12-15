/*Aim : - To understand Interface in Java.
Problem Statement:- Design and develop a context for given case study and
implement an interface for Vehicles Consider the example of vehicles like
bicycle, car, and bike. All Vehicles have common functionalities such as Gear
Change, Speed up and apply breaks . Make an interface and put all these
common functionalities. Bicycle, Bike, Car classes should be implemented for
all these functionalities in their own class in their own way.*/
//********************Vehicle.java***********************
public interface Vehicle {
 void changeGear(int x);
 void speedUp(int x);
 void applyBrakes(int x);
}
//********************Bicycle.java***********************
public class Bicycle implements Vehicle
{
 int speed ;
 int gear ;
 //Override
 public void changeGear(int Gear)
 {
 gear = Gear ;
 }
 //Override
 public void speedUp(int increment)
 {
 speed = speed + increment ;
 }
 //Override
 public void applyBrakes(int decrement)
 {
 speed = speed - decrement ;
 }
 public void statusDisplay()
 {
 System.out.println("Gear:" +gear+ " speed:" +speed);
 }
}
//********************Bike.java***********************
public class Bike implements Vehicle
{
 int speed ;
 int gear ;
 //Override
 public void changeGear(int Gear)
 {
 gear = Gear ;
 }
 //Override
 public void speedUp(int increment)
 {
 speed = speed + increment ;
 }
 //Override
 public void applyBrakes(int decrement)
 {
 speed = speed - decrement ;
 }
 public void statusDisplay()
 {
 System.out.println("Gear:" +gear+ " speed:" +speed);
 }
}
//********************Car.java***********************
public class Car implements Vehicle
{
 int speed ;
 int gear ;
 //Override
 public void changeGear(int Gear)
 {
 gear = Gear ;
 }
 //Override
 public void speedUp(int increment)
 {
 speed = speed + increment ;
 }
 //Override
 public void applyBrakes(int decrement)
 {
 speed = speed - decrement ;
 }
 public void statusDisplay()
 {
 System.out.println("Gear:"+gear + " speed:"+speed);
 }
}
//*******************InterfaceDemo.java******************
public class InterfaceDemo {
 public static void main(String[] args) {
 Bicycle b = new Bicycle();
 b.changeGear(3);
 b.speedUp(2);
 b.applyBrakes(1);
 System.out.println("Bicycle state : ");
 b.statusDisplay();
 Bike bk = new Bike();
 bk.changeGear(4);
 bk.speedUp(3);
 bk.applyBrakes(2);
 System.out.println("Bike state : ");
 bk.statusDisplay();
 Car c = new Car();
 c.changeGear(5);
 c.speedUp(3);
 c.applyBrakes(1);
 System.out.println("Car state : ");
 c.statusDisplay();
 }
}
