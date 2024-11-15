package Access_Modifier;

class Launch 
{
    public void abc()
    {
        A obj= new A();
        System.out.println(obj.n1);
        System.out.println(obj.marks);
    }
}

public class A {
    protected int n1=12;
    private int n =6; // private variables only accessable in the class in which it is declare .
    int marks =6;  // A file is placed in different package so we cannot access its variable or method if they are not declare with public 
    public void show()
    {

    }
}
