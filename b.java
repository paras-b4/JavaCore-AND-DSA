import java.util.Scanner;

class b
{



    public static void main (String [] args)
     {
        Scanner obj1 = new Scanner(System.in);// hare obj1 is a refrence variable referring to the object in the heap memory . 
        System.out.println("Enter your number:");

            int a = obj1.nextInt();
            int result = (a % 2 == 0) ? 10 : 20;
            System.out.println(result);
        
    }


}