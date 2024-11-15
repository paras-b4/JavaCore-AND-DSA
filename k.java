import java.util.Scanner ;
class Method_overloading
{
    public int mul(int n1,int n2)
    {
        int r1=n1*n2;
        return r1;
    }
    public int mul(int n1,int n2,int n3)
    {
        int r2=n1*n2*n3;
        return r2;
    }
}
class k
{
    public static void main(String[] args)
    {
        Method_overloading over = new Method_overloading();
        Scanner obj =new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int num=over.mul(a,b);
        System.out.println(num);
        
        System.out.println("enter third numbers");
        int c = obj.nextInt();
        int num1=over.mul(a,b,c);
        System.out.println(num1);
    }
     
}
/*
class k
{
    public static void main(String[] args)
    {
        Method_overloading over = new Method_overloading();
        Scanner obj =new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int num=over.mul(a,b);
        System.out.println(num);
        
        System.out.println("enter third numbers");
        int c = obj.nextInt();
        int num1=over.mul(a,b,c);
        System.out.println(num1);
    }
}
*/
