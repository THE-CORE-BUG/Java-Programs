import java.util.Scanner;
import java.util.Arrays;
public class array_rotation_sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of digits: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the digits :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotations :");
        int d;
        d=sc.nextInt();
        System.out.println("Enter the sum you want to match with: ");
        int sum;
        sum=sc.nextInt();
        Arrays.sort(arr);
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
            System.out.println(arr2[i]);
        }
        int l,r;
        l=n-d-1;
        r=n-d;
        int k=0;
        while(l!=r)
        {
            try{
                if((arr2[l]+arr2[r])==sum)
                {
                    k=1;
                    break;
                }
                else if((arr2[l]+arr2[r])<sum)
                {
                    r++;
                }
                else if((arr2[l]+arr2[r])>sum)
                {
                    l--;
                }
            }
            catch(Exception e){
                break;
            }
        }
        if(k==1)
        {
            System.out.println("Sum is possible");
        }
        else
        {
            System.out.println("Sum is not possible");
        }
    }
}