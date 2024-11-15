class A // class A is an outer class
 {

    int n;
    public void show()
    {
        System.out.println("in A show");
    }
    class B // here  class b is an inner class 
    {
        public void show ()
        {
            System.out.println("in B show");
        }
    }
}
class main 
{
    public static void main(String[] args) 
    {
        A obj=new A();
        obj.show();
        A.B obj1= obj.new B();
        obj1.show();

        
    }
}
/* 

class A // class A is an outer class , we cannot make outer class static only public, abstract & final are permitted
 {

    int n;
    public void show()
    {
        System.out.println("in A show");
    }
    static class B // here  class b is an inner class we can make the inner class static 
    {
        public void show ()
        {
            System.out.println("in B show");
        }
    }
}
class main 
{
    public static void main(String[] args) 
    {
        A obj=new A();
        obj.show();
        A.B obj1= new A.B();
        obj1.show();

        
    }
}*/

