import java.util.Scanner;
public class array_reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of digits: ");
        n=sc.nextInt();
        System.out.println("Enter the numbers: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int arr2[]=new int[n];
        int c=0;
        for(int i=n-1;i>=0;i--)
        {
            arr2[c++]=arr[i];
        }
        System.out.println("The reversed array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}