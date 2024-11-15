// java does not support multiple inheritance to avoid the dimond problem which causes complexity and unambiguity .
// but there are some indirect way to achive multiple inheritance in java by using interface
interface A 
{
    void show();
} 
interface B 
{
    void config(int id );
}
class C implements A,B 
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config(int id )
    {
        System.out.println(" in config"+id);
    }



    public static void main (String a[])
    {
        C obj=new C ();
        obj.show();
        obj.config(1236);

    }


}
/* 
interface A
{
    void show();
} 
interface B 
{
    void config(int id );
}
interface C extends A,B
{
    void run();
}
class D implements C
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config(int id )
    {
        System.out.println(" in config"+id);
    }
    public void run()
    {
        System.out.println("in run");
    }



    public static void main (String a[])
    {
        C obj=new C ();
        obj.show();
        obj.config(1236);
        obj.run(;)

    }


}*/
    
