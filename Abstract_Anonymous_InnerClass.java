abstract class A 
{
    public abstract void show();
    public abstract void config();
    
}
class main
{
    public static void main(String[] args) {
        A obj=new A() 
        {
            public void show()
            {
                System.err.println("in new show");
            }
            public void config()
            {
                System.out.println("in a config");
            }
            
        };
        obj.show();
        obj.config();
    }
}
