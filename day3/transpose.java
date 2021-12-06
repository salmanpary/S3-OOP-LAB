import java.util.*;
class transpose{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int m,n;
System.out.println("enter the number of rows:\n");
m=sc.nextInt();
System.out.println("enter the number of column\n");
n=sc.nextInt();
int arr[][]=new int[10][10];
System.out.println("enter the elements");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
arr[i][j]=sc.nextInt();
}

}
System.out.println("the elements in te original matrix is");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println("");
}
int brr[][]=new int[10][10];
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
brr[j][i]=arr[i][j];
}
}
System.out.println("After transposing the elements are...");
        for(int i=0;i<n;i++)      
        {
             for(int j=0;j<m;j++)
             {
                 System.out.print(brr[i][j]+" ");
             }
            System.out.println("");
        }



}
}
