import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the number");
          int n=sc.nextInt();
          for(int i=1;i<n;i++)
          {
            System.out.println(" "+ i+" ");
          }
          System.out.println(" Even numbers");
          for(int i=2;i<n;i=i+2)
          {
            System.out.println(" "+ i+" ");
          }
          
          int i=0;
          int sum=0;
          while(i<n)
          {
            sum+=i;
            i++;
          }
          System.out.println("sum is"+sum);
        }
    }

