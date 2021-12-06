import java.util.Scanner;
class Example2{
static int getsum(int num){
int sum=0;
while(num!=0){
sum=sum+num%10;
num=num/10;
}
return sum;
}
public static void main(String[] args){
int number,sumofdigit;
Scanner sc = new Scanner(System.in);  
System.out.print("enter the number");
number=sc.nextInt(); 
System.out.println("sum of digits"+getsum(number));

}

}
