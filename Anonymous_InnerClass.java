class A 
{
    public void show()
    {
        System.out.println("in A show");
    }
}
class main
{
    public static void main(String[] args) {
        A obj=new A()
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();

    }
}
abstract class C 
{
    public abstract void show();
    
}
class main1
{
    public static void main(String[] args) {
         A obj=new A()
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();

    }
}


