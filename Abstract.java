abstract class car 
{
    public abstract void drive();
    public abstract void speed();
    /**
     * 
     */
    public void milage()
    {
        System.out.println("car gives good milage");
    }
}
class kia extends car 
{
    public void drive()
    {
        System.out.println("drive kia car");
    }
    public void speed()
    {
        System.out.println("kia has good speed");
    }
}
class main
{
    public static void main(String a[])
    {
        car obj= new kia();
        obj.milage();
        obj.drive();
        obj.speed();


    }
}
