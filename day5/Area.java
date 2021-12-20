import java.io.*;
import java.util.*;
import java.lang.Math.*;
class Areafind{
void area(double r){
System.out.println("the area of circle  is"+Math.PI*r*r);
}
void area(double a,double b){
System.out.println("the area of rectangle is :"+a*b);
}
void area(double a,double b,double c){
System.out.print("the area of triangle is");
double s=(a+b+c)/2;
double ar=s*(s-a)*(s-b)*(s-c);
double rar=Math.sqrt(ar);
System.out.print(""+rar);
}
}
class Area{
public static void main(String[] args){
Areafind arr=new Areafind();
arr.area(2.3);
arr.area(3.0,4.0);
arr.area(1.2*5.3*4.2);
}

}
