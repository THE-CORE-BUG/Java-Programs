import java.util.Scanner;
public class array_rotation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotations you want to make :");
        int d;
        d=sc.nextInt();
        int arr2[]=new int[n];
        for(int i=n-d,j=0;i<n;i++)
        {
            arr2[i]=arr[j++];
        }
        for(int i=d,j=0;i<n;i++)
        {
            arr2[j++]=arr[i];
        }
        System.out.println("The new array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}