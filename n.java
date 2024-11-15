// In this we are talking about Run time polymorphism
// during compile time we donot no which show() method is called from which class
class n{
    public void show()
    {
        System.out.println("in a show");
    }
}
class B extends n
{
    public void show()
    {
        System.out.println("in b show");
    }
}
class C extends n
{
    public void show()
    {
        System.out.println("in c show");
    
    }
}
class G 
{
    public static void main(String a[])
    {
        n obj= new n();
        obj.show();

        obj=new B(); // reference of A and create object of B and assign to parent reference variable .
        obj.show();// output -->In b show

        obj=new C();//reference of A and create object of C and assign to parent reference variable .
        obj.show();// output --> In c show






    }
}