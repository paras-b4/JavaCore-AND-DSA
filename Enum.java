 /*
 --> the enum in java is a data type which contain a fixed set of constant or named constant
 --> Enumeration serves the purpose of representing a group of named constant in a programing language
  1.according to java naming convetion we should have all constant in capital letter.
  2.An enum is a special class that represtent a group of constant .
  3.use enum when you have values that you know arenot going to chnage like :- week days,colors ,deck of card , seasson , months ,etc
  Q1.can we create the instance of enum by the new keyword ?
  ans. no, we cannot create the instance of the enum keyword because it contains private constructors only.
  Q2. can we have an abstract method in the enum ?
  ans . yes we have an abstract method in enum.
  Q3. what is the purpose of the value() method in the enum ?
  ans. In java the value () method can be used to return all value present inside the enum. in the form of an array
  Q4. what is the purpose of the ordinal() method in the enum ?
 ans. by using oedinal() method each enum constant index can be found , just like an array index .
 */
/* 
enum status{
    RUNNING,FAILED,PENDING ,SUCCESS;
}
public class Enum
{
    

    public static void main(String[] args) {
       // status ss= status.RUNNING;
        

        status ss[]= status.values();
        for (status s : ss )

        System.out.println(s+":"+s.ordinal());
    }
}
*/
// enum can be easily used in switch
enum status{
    RUNNING,FAILED,PENDING ,SUCCESS;
}
public class Enum
{
    

    public static void main(String[] args) {
       // status ss= status.RUNNING;
        

        status ss = status.SUCCESS;
        

        switch (ss) {
            case RUNNING:
                System.out.println(" ALL DONE ");
                break;
            case FAILED:
                System.out.println("TRY AGAIN");
                break;
            case PENDING:
                System.out.println(" PLEASE WAIT ");
                break;
            case SUCCESS:
                System.out.println("DONE");
                break;
            
            default:
            System.out.println("somthing went wrong");
                break;

        }

    }

}
enum Laptop
{
    MACKBOOK("this is a mackbook"),SURFACE(),THINKPAD(1500),XPS(2200);

    private int price;
    private String price1;
    private Laptop()
    {
        price=500;
    }

    private Laptop(int price) {
        this.price=price;
        System.out.println("in laptop"+ this.name());
    }
    private Laptop(String price1) {
        this.price1=price1;
        System.out.println("in laptop"+ this.name());
    }
    public int  getPrice(){
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public String  getPrice1(){
        return price1;
    }
    public void setPrice1(String price1)
    {
        this.price1=price1;
    }
}
class main
{
    public static void main(String[] args) {
        Laptop lap[]=Laptop.values();
        for (Laptop lap1:lap){
            System.out.println(lap1+":"+lap1.getPrice()+lap1.getPrice1() );
        }

    }
}