import java.util.*;
class Problem1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n%2==0){System.out.println("even");}
        else{System.out.println("odd");}
        if(n>0)
        {
            System.out.println("positive");
        }
        else if(0>n)
        {
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
}



