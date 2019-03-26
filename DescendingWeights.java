
import java.util.*;
class DescendingWeights {
    public static void main(String args[] ) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int temp;
    int[] a=new int[n];
    int[] b=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        b[i]=a[i]%k;
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-1;j++)
        {
            if(b[j]<b[j+1])
            {
                temp=b[j];
                b[j]=b[j+1];
                b[j+1]=temp;
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    for(int i=0;i<n;i++)
    {
        System.out.print(a[i]+" ");
    }
          

    }
}
