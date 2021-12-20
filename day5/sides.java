import java.io.*;
import java.util.*;
abstract class Shape{
abstract void numberOfSides();
}
class Rectangle extends Shape{
void numberOfSides(){
System.out.println("the number of sides are 4");
}
}
class Triangle extends Shape{
void numberOfSides(){
System.out.println("the number of sides are 3");
}
}
class Hexagon extends Shape{
void numberOfSides(){
System.out.println("the number of sides are 6");
}
}
class sides{
public static void main(String args[]){
Rectangle r=new Rectangle();
Triangle t=new Triangle();
Hexagon h=new Hexagon();
r.numberOfSides();
t.numberOfSides();
h.numberOfSides();
}
}
