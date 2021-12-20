import java.io.*;
import java.util.*;
class Employee{
float salary;
String name;

public void display(){
System.out.println("the class name is: Employee");
}
public void calcsalary(){
System.out.println("salary=10000");

}
}
class Engineer extends Employee{

 @Override
 
 public void calcsalary(){
 System.out.println("the salary is 20000");
 }
}
class Main2{
public static void main(String[] args){
Engineer eng=new Engineer();
eng.display();
eng.calcsalary();

}

}

