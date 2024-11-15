// whenever you call an object it will create a constructor of a class
// when we create an object of a class that it call the constructor of a sub class as well as super class 
// if you dont pass any value in an object ,then it will call the default constructor of that class
// if you pass any value in an object ,then it will call the parametrized constructor of that class
// super method is there when you create a constructor and it refers to the super class
//---> super means call the constructor of super class
//===> this will execute the constructor of the same class .
// Every class in java extend the object class .
class A 
{
    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("in A int");
    }
    public void show() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }
}
class B extends A
{
    public B()
    {
        super(); // super method refers to the super class
        System.out.println("in B");
    }
    public B(int n1) 
    {
        this(); // this will execute the constructor of the same class .
        System.out.println(" in B int ");
    }
} 
class p
{
    public static void main(String[] args)
    {
       
        B obj = new B (6); // we are creating the object of the class and passsing the value it should be a no not variable. 
    }
    

}