// functional interface also known as SAM ( single abstract method ) a functional interface has only one abstrace method .
// we are implementing functional interface in lambda expression . 
// Lambda expression is a concise way to implement a functional interface . 
// lambda expression allow us to define the behaviour of a functional interface in a single line . 

/* 
    
interface A 
{
    public void show();
    
}
class main 
{
    public static void main(String[] args) {
        A obj=new A(){
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();


    }
}
*/
// Lambda Expression
    
interface A 
 {
     void show(int i);
    
 }
class main 
{
    public static void main(String[] args ) {
        A obj=(int i) -> 
        
            System.out.println("in new show");
            
        
        obj.show(5);
    


    }
}
