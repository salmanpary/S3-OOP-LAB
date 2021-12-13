import java.io.*;
import java.util.*;
class Employee{
String name;
int age;
int phonenumber;
double salary;
public void printsalary(){
System.out.println(this.salary);

}
}
class Manager extends Employee{

String department;


}
class Officer extends Employee{
String specialization;

}
class Main3{
public static void getdatamanager(){
Manager mn=new Manager();
Scanner sc=new Scanner(System.in);

System.out.println("enter the name");
mn.name=sc.nextLine();
System.out.println("enter the age");
mn.age=sc.nextInt();
System.out.println("enter the phone number");
mn.phonenumber=sc.nextInt();
System.out.println("enter the salary");
mn.salary=sc.nextDouble();
System.out.println("the details of officer is:");
System.out.println("name:"+mn.name);
System.out.println("age:"+mn.age);
System.out.println("phonenumber:"+mn.phonenumber);
System.out.println("salary:"+mn.salary);



}
public static void getdataofficer(){
Officer of=new Officer();
Scanner sc1=new Scanner(System.in);

System.out.println("enter the name");
of.name=sc1.nextLine();
System.out.println("enter the age");
of.age=sc1.nextInt();
System.out.println("enter the phone number");
of.phonenumber=sc1.nextInt();
System.out.println("enter the salary");
of.salary=sc1.nextDouble();
System.out.println("the details of officer is:");
System.out.println("name:"+of.name);
System.out.println("age:"+of.age);
System.out.println("phonenumber:"+of.phonenumber);
System.out.println("salary:"+of.salary);


}

public static void main(String[] args){
getdatamanager();


}
}
