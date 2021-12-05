import java.util.Scanner;
public class array_rotation_range
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter the number of digits: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the digits: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotations: ");
        int r;
        r=sc.nextInt();
        int range[][]=new int[r][2];
        System.out.println("Enter the ranges: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<2;j++)
            {
                range[i][j]=sc.nextInt();
            }
        }
        int index;
        System.out.println("Enter the index: ");
        index=sc.nextInt();
        int left,right;
        for(int i=r-1;i>=0;i--)
        {
               left=range[i][0];
               right=range[i][1];
               if(left<=index && right>=index)
               {
                   if(index==left)
                   {
                       index=right;
                    }
                    else
                    {
                        index--;
                    }
                }
        }
        System.out.println("The element at index after rotation will be: "+ arr[index]);
    }
}