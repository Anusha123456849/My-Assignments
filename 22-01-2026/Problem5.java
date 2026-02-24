class Problem5
{
    public static void main(String[]args)
    {
      employee e1=new employee(100,"anusha",50000,"innova");
      e1.annualsalary();
      e1.show();
      employee e2=new employee(200,"lathasri",70000,"Thomson reuters");
      e2.annualsalary();
      e2.show();
    }
}
class employee
{
    int id;
    String name;
    int monthlysalary;
    static String companyname;
    employee(int id,String name,int monthlysalary,String companyname)
    {
        this.id=id;
        this.name=name;
        this.monthlysalary=monthlysalary;
        this.companyname=companyname;
    }
    void annualsalary()
    {
        System.out.println(12*monthlysalary);
    }
    void show()
    {
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("monthlysalary:"+monthlysalary);
        System.out.println("companyname"+companyname);
    }
}
