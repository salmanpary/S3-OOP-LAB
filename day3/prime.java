import java.util.*;
class prime{
public static void main(String[] args){
int n;
Scanner sc=new Scanner(System.in);
System.out.print("enter the number");
n=sc.nextInt();
boolean flag=false;
for(int i=2;i<=n/2;i++){
if(n%i==0){
flag=true;
break;
}
}
if(flag==false){
System.out.println(n+"is a prime number");
}
else{
System.out.println(n+"is not a prime number");
}
}
}
