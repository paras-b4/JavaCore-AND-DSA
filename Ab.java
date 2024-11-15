//            UPCASTING AND DOWNCASTING
class Ab {
    public void show()
    {
        System.out.println("in A show");
    }
    
}
class B extends Ab
{
    public void show1()
    {
        System.out.println("in B show");
    }
}
class main
{
    public static void main(String[] args) {
        Ab obj= new B();  // here we have object of B and reference of A so preference is given to reference variable So there we have same method name so this is a concept of method overriding 
        obj.show();// if we have different method name and making an object of B and have reference of Ab and calling the method of Ab this is called upcasting .
        // but we cannot call the method of B class due to refrence of Ab
        B obj1= (B) obj ;//obj is reference of A but we are tycasting it into B just like double to int .
        obj1.show1();
        obj1.show();
   
    }

}
//               
