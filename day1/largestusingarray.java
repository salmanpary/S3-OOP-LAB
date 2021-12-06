import java.util.Scanner;
public class largestusingarray

{
static int max(int [] array) {
      int max = 0;

      for(int i=0; i<array.length; i++ ) {
         if(array[i]>max) {
            max = array[i];
         }
      }
      return max;
   }
public static void main(String[] args)
{
int n, max;
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of elements in the array:");
n = s.nextInt();
int a[] = new int[n];
System.out.println("Enter the elements of array:");
for(int i = 0; i < n; i++)
{
a[i] = s.nextInt();
}

System.out.println("Maximum value in the array is:"+max(a));
}
}
