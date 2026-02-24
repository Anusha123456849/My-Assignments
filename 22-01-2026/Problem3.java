public class Problem3 {
    public static void main(String[]args)
    {
       Problem3 p1=new Problem3();
       System.out.println(p1.add(2,3));
       System.out.println(p1.isEven(2));
       System.out.println(p1.factorial(6));
    }
    int add(int a,int b)
    {
        return a+b;
    }
    Boolean isEven(int number)
    {
       if(number%2==0){return true;}
       else{return false;}
    }
    int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<n;i++)
        {
            fact*=i;
        }
        return fact;
    }
}

