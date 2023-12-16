/*Aim : Design and develop inheritance for a given case study, identify objects
and relationships and implement inheritance wherever applicable. Employee
class with Emp_name, Emp_id, Address, Mail_id, and Mobile_no as members.
Inherit the classes, Programmer, Team Lead, Assistant Project Manager and
Project Manager from employee class. Add Basic Pay (BP) as the member of all
the inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF,
0.1% of BP for staff club fund. Generate pay slips for the employees with their
gross and net salary.
 Objectives:
 1) To Study Inheritance and its types
 2) To implement inheritance using OOP language*/
//*********************Employee.java******************
import java.util.Scanner ;
public class Employee {
 int empid ;
 String name ;
 long mobile ;
 String address ;
 String email ;
 public Employee() {
 this.empid = 0;
 this.name = null;
 this.mobile = 0;
 this.address = null ;
 this.email = null ;
 }
 public Employee(int empid ,String name ,long mobile ,String
address ,String email ) {
 this.empid = empid;
 this.name = name;
 this.mobile = mobile;
 this.address = address ;
 this.email = email ;
 }
 public void input()
 {
 Scanner sc = new Scanner(System.in) ;
 System.out.println("Enter Employee id : ");
 this.empid = sc.nextInt() ;
 System.out.println("Enter Employee Name : ");
 this.name = sc.next() ;
 System.out.println("Enter Mobile Number : ");
 this.mobile = sc.nextLong() ;
 System.out.println("Enter Email id : ");
 this.email = sc.next() ;
 System.out.println("Enter Address : ");
 this.address = sc.next() ;
 }
 public void display()
 {
 System.out.println("Employee id : " +empid);
 System.out.println("Employee Name : " +name);
 System.out.println("Mobile Number : " +mobile);
 System.out.println("Email id : " +email);
 System.out.println("Address : " +address);
 } }
//****************Programmer.java*****************
import java.util.Scanner ;
public class Programmer extends Employee {
 double bp,da,hra,pf,club,net,gross,deduct ;
 public Programmer () {
 this.bp = 0 ;
 this.da = 0 ;
 this.hra = 0 ;
 this.pf = 0 ;
 this.club = 0 ;
 this.net = 0 ;
 this.gross = 0 ;
 this.deduct = 0;
 }
 public Programmer(double bp,double da,double hra,double
pf,double club,double net,double gross,double deduct ) {
 this.bp = bp;
 this.da = da ;
 this.hra = hra ;
 this.pf = pf ;
 this.club = club ;
 this.net = net ;
 this.gross = gross ;
 this.deduct = deduct ;
 }
 public double getBasicPay() {
 Scanner sc =new Scanner (System.in) ;
 System.out.println("Enter basic pay for programmer : ");
 bp = sc.nextDouble() ;
 return bp ;
 }
 public void calculateSal(Programmer p) {
 double bp = p.getBasicPay () ;
 da = 0.97 * bp ;
 hra = 0.10 * bp ;
 pf = 0.12 * bp ;
 club = 0.001 * bp ;
 gross = bp + da + hra ;
 deduct = pf + club ;
 net = gross - deduct ;
 }
 public void displaySalslip()
 {
 System.out.println("\n\n*****PROGRAMMER SALARY
SLIP*****\n\n");
 this.display() ;
 System.out.println("Basic Pay : " +this.bp);
 System.out.println("DA : " +this.da);
 System.out.println("HRA : " +this.hra);
 System.out.println("PF : " +this.pf);
 System.out.println("Staff Club : " +this.club);
 System.out.println("\n Gross Salary : " +this.gross);
 System.out.println("\n Deduction in Salary: " +this.deduct);
 System.out.println("\n Net Salary : " +this.net);
 }
}
//*****************TeamLead.java*****************
import java.util.Scanner ;
public class TeamLead extends Employee {
 double bp,da,hra,pf,club,net,gross,deduct ;
 public Programmer () {
 this.bp = 0 ;
 this.da = 0 ;
 this.hra = 0 ;
 this.pf = 0 ;
 this.club = 0 ;
 this.net = 0 ;
 this.gross = 0 ;
 this.deduct = 0;
 }
 public Programmer(double bp,double da,double hra,double
pf,double club,double net,double gross,double deduct ){
 this.bp = bp;
 this.da = da ;
 this.hra = hra ;
 this.pf = pf ;
 this.club = club ;
 this.net = net ;
 this.gross = gross ;
 this.deduct = deduct ;
 }
 public double getBasicPay() {
 Scanner sc =new Scanner (System.in) ;
 System.out.println("Enter basic pay for programmer : ");
 bp = sc.nextDouble() ;
 return bp ;
 }
 public void calculateSal(Programmer p) {
 double bp = p.getBasicPay () ;
 da = 0.97 * bp ;
 hra = 0.10 * bp ;
 pf = 0.12 * bp ;
 club = 0.001 * bp ;
 gross = bp + da + hra ;
 deduct = pf + club ;
 net = gross - deduct ;
 }
 public void displaySalslip()
 {
 System.out.println("\n\n*****PROGRAMMER SALARY
SLIP*****\n\n");
 this.display() ;
 System.out.println("Basic Pay : " +this.bp);
 System.out.println("DA : " +this.da);
 System.out.println("HRA : " +this.hra);
 System.out.println("PF : " +this.pf);
 System.out.println("Staff Club : " +this.club);
 System.out.println("\n Gross Salary : " +this.gross);
 System.out.println("\n Deduction in Salary: " +this.deduct);
 System.out.println("\n Net Salary : " +this.net);
 } }
//************AssistantProjectManager.java************
import java.util.Scanner;
public class AssistantProjectManager extends Employee {
 double bp,da,hra,pf,club,net,gross,deduct ;
 public AssistantProjectManager() {
 this.bp = 0 ;
 this.da = 0 ;
 this.hra = 0 ;
 this.pf = 0 ;
 this.club = 0 ;
 this.net = 0 ;
 this.gross = 0 ;
 this.deduct = 0;
 }
 public AssistantProjectManager(double bp,double da,double
hra,double pf,double club,double net,double gross,double
deduct) {
 this.bp = bp;
 this.da = da ;
 this.hra = hra ;
 this.pf = pf ;
 this.club = club ;
 this.net = net ;
 this.gross = gross ;
 this.deduct = deduct ;
 }
 public double getBasicPay() {
 Scanner sc =new Scanner (System.in) ;
 System.out.println("Enter basic pay for
AssistantProjectManager : ");
 bp = sc.nextDouble() ;
 return bp ;
 }
 public void calculateSal(AssistantProjectManager a) {
 double bp = a.getBasicPay () ;
 da = 0.97 * bp ;
 hra = 0.10 * bp ;
 pf = 0.12 * bp ;
 club = 0.001 * bp ;
 gross = bp + da + hra ;
 deduct = pf + club ;
 net = gross - deduct ;
 }
 public void displaySalslip()
 {
 System.out.println("\n\n*****ASSISTANT PROJRECT
MANAGER SALARY SLIP*****\n\n");
 this.display() ;
 System.out.println("Basic Pay : " +this.bp);
 System.out.println("DA : " +this.da);
 System.out.println("HRA : " +this.hra);
 System.out.println("PF : " +this.pf);
 System.out.println("Staff Club : " +this.club);
 System.out.println("\n Gross Salary : " +this.gross);
 System.out.println("\n Deduction in Salary: " +this.deduct);
 System.out.println("\n Net Salary : " +this.net);
 }
}
//************ProjectManager.java*****************
import java.util.Scanner ;
public class ProjectManager extends Employee {
 double bp,da,hra,pf,club,net,gross,deduct ;
 public ProjectManager () {
 this.bp = 0 ;
 this.da = 0 ;
 this.hra = 0 ;
 this.pf = 0 ;
 this.club = 0 ;
 this.net = 0 ;
 this.gross = 0 ;
 this.deduct = 0;
 }
 public ProjectManager(double bp,double da,double hra,double
pf,double club,double net,double gross,double deduct ) {
 this.bp = bp;
 this.da = da ;
 this.hra = hra ;
 this.pf = pf ;
 this.club = club ;
 this.net = net ;
 this.gross = gross ;
 this.deduct = deduct ;
 }
 public double getBasicPay() {
 Scanner sc =new Scanner (System.in) ;
 System.out.println("Enter basic pay for ProjectManager : ");
 bp = sc.nextDouble() ;
 return bp ;
 }
 public void calculateSal(ProjectManager a) {
 double bp = a.getBasicPay () ;
 da = 0.97 * bp ;
 hra = 0.10 * bp ;
 pf = 0.12 * bp ;
 club = 0.001 * bp ;
 gross = bp + da + hra ;
 deduct = pf + club ;
 net = gross - deduct ;
 }
 public void displaySalslip()
 {
 System.out.println("\n\n*****PROJECT MANAGER SALARY
SLIP*****\n\n");
 this.display() ;
 System.out.println("Basic Pay : " +this.bp);
 System.out.println("DA : " +this.da);
 System.out.println("HRA : " +this.hra);
 System.out.println("PF : " +this.pf);
 System.out.println("Staff Club : " +this.club);
 System.out.println("\n Gross Salary : " +this.gross);
 System.out.println("\n Deduction in Salary: " +this.deduct);
 System.out.println("\n Net Salary : " +this.net);
 }
}
//*****************Salary.java*****************
import java.util.Scanner;
public class Salary {
 public static void main(String[] args) {
 int m ;
 char n ;
 Scanner input = new Scanner(System.in);
 do
 {
 System.out.println("\n1.Programmer \n2.TeamLead
\n3.AssistantProjectManager \n4.ProjectManager
\nEnter_Your_Choice" );
 m = input.nextInt();
 switch(m)
 {
 case 1 :
 Programmer prog = new Programmer() ;
 prog.input() ;
 prog.calculateSal(prog) ;
 prog.displaySalslip() ;
 break ;
 case 2 :
 TeamLead team = new TeamLead() ;
 team.input() ;
 team.calculateSal(team) ;
 team.displaySalslip() ;
 break ;
 case 3 :
 AssistantProjectManager apm = new
AssistantProjectManager() ;
 apm.input() ;
 apm.calculateSal(apm) ;
 apm.displaySalslip() ;
 break ;
 case 4 :
 ProjectManager pm = new
ProjectManager() ;
 pm.input() ;
 pm.calculateSal(pm) ;
 pm.displaySalslip() ;
 break ;
 default :
 System.out.println("Wrong Choice");
 }
 System.out.println("\n Do you want to continue : y/n :");
 n = input.next().charAt(0) ;
 } while(n == 'y') ;
 System.out.println("Program Executed Successfully....");
 }
} 
