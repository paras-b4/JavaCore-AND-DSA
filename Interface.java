/*
An interface defines a set of method but does not implement them 
 A class that implements the interface agree to implement all of the method defined in the interface
 An interface is a collection of method declaration 
Need of interface
1. it is used to implement abstraction
2. we can also achive multiple inheritance in java by using interface.
3. it is used to achive loose coupling 
4. A class can implements more than one interface 
# types of interface 1.Normal interface 2.Functional interface 3.Marker Interface 
marker interface is an empty interface ex of marker interface are serializabl , cloneable and remote interface .

         Difference between abstract class and interface
Abstract class can have both abstract and non abstract method    | interface can have only abstract method
Abstract class doesnot support multiple inheritance              | interface supports multiple iheritance
 */

interface A 
{
    void show();
    void config();

}
class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
}   
class main 
{
    public static void main(String[] args) 
    {
        A obj = new B();
        obj.show();
        obj.config();
    }
}
