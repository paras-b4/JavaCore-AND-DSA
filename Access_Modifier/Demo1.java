package Access_Modifier;

class c extends B1
{
    public void pqrs(){
        B1 obj=new B1();
        System.out.println(obj.n1);

    }
   
}
class d extends A
{
    A obj =new A();
    

}
public class Demo1 {
    public static void main(String[] args) {
        
        A obj= new A();
        System.out.println(obj.marks);
        obj.show();

        B1 obj1= new B1();
        System.out.println(obj1.marks);


    }
}
