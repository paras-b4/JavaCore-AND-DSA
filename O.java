/*
class O
{
    public void show()
    {
        System.out.println("in A show ");
    }
    public void config()
    {
        System.out.println("in A config");
    }

}
class B extends O
{
    public void show()
    {
        System.out.println("in B show");
    }
    
}
class g 
{
    public static void main(String[] args)
    {
        B obj=new B();
        obj.show();
        obj.config();

    }
}
*/
class O
{
    public int add(int a,int b)
    {
        return a+b ;
    }

}
class AdvCalc extends O
{
    public int add(int a,int b)
    {
        return a+b+1;
    }
}
class H
{
    public static void main(String[] args)
    {
        AdvCalc obj = new AdvCalc();
        int m=obj.add(5,6);
        System.out.println(m);


    }
   
}