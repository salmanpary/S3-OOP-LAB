import java.util.*;
class secondsmallest{
public static int getsecondsmallest(int[] a,int total){
int temp;
for(int i=0;i<total;i++){
for(int j=i+1;j<total;j++){
if(a[i]>a[j]){
temp=a[i];
a[j]=a[i];
a[j]=temp;
}
}
}
return a[1];
}


public static void main(String args[]){
int n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of elements you want to store");
n=sc.nextInt();
int[] a=new int[10];
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
a[i]=sc.nextInt();  
}


System.out.println("second smallest"+getsecondsmallest(a,5));
}
}
