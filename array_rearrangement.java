import java.util.Scanner;
public class array_rearrangement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        System.out.println("Enter the digits: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int k=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    k=1;
                    arr2[i]=arr[j];
                    break;
                }
            }
            if(k==0)
            {
                arr2[i]=-1;
            }
        }
        System.out.println("The final array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}