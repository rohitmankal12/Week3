
import java.util.*;
class RodCutting {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int p=sc.nextInt();
            int count=0;
            int a=3;
            while(a<=p)
            {
                count++;
                a=a*2+1;
            }
            System.out.println(count);
        }
 

    }
}
