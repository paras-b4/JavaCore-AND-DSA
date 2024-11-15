//the Integer class wraps a value of primitive type int in an object
class Wrapper
{
    public static void main(String a[]){

    
    int num=8;
    //Integer num1= new Integer(num);   // Boxing --> it is manual method to convert primitive type data into non-primitive type 
    Integer num1=num;           //  autoboxing the Integer class wrape a value of primitive type int in an object

    //int num2= num1.intValue();  // unboxing --> it is manual method to convert non=primitive data type to primitive type
    //int num2=num1; // autounboxing
    System.out.println(num1);

    String str = "13";
    int num3= Integer.parseInt(str);
    String str1= Integer.toString(num1);
    System.out.println(num3);
    System.out.println(str1);

    

 
    }


    
}
