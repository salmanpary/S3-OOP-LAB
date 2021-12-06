import java.io.*;
import java.util.Scanner;
class reverse{
public static void main(String[] args){
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
System.out.print("Enter a string: ");  
String str= sc.nextLine();
String nstr="";
char ch;
System.out.print("the original word is :");
System.out.println("salman");
for(int i=0;i<str.length();i++){
ch=str.charAt(i);
nstr=ch+nstr;

}
System.out.println("The reversed word:"+nstr);

}
}
