class A 
{
    public static void main(String[] args) 
    {
        int num= 5; // final variable means we cannot change the value of this final variable because final is used to make constant .
        num= 6;
        System.out.println(num);
        
    }
    
}
//final class B 
class B    // final class means no can extends it we are stoping inheritance . 
{
     public final void show() // if we are making a method final then no one can override this method
    {
        System.out.println("in B show");
    }
    public void eat()
    {
        System.out.println("i am eating");
    }
}
class C extends B
{
    public void show1()
    {
        System.out.println("in C show");
    }
}
class D 
{
    public static void main(String a[])
    {
        C obj= new C();
        obj.show();
        obj.eat();
    }
}
