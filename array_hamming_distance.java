import java.util.Scanner;
public class array_hamming_distance
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of digits: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the digits: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int arr2[]=new int[n*2+1];
        for(int i=0;i<n;i++)
        {
            arr2[i]=arr[i];
            arr2[n+i]=arr[i];
        }
        int max=0;
        for(int i=1;i<n;i++)
        {
            int c=0;
            for(int j=i,k=0;j<(n+i);j++,k++)
            {
                if(arr2[j] != arr[k])
                {
                    c++;
                }
            }
            if(c==n)
            {
                max=n;
                break;
            }
            else if(c>max)
            {
                max=c;
            }
        }
        System.out.println("The maximum hamming distance is: "+max);
    }
}