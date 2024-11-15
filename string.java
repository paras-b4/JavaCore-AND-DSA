
// hashcode is unique no for each object created in heap . hashcode is used to identify object . 
// String is a sequence of character enclosed in a square brackets . 
// mutable = something can be change .
// Immutable  = somthing cnnot be chnage .
class main
{
    public static void main(String[] args) {
        String obj=new String("welcome");
        String obj1=new String("abcd");
        System.out.println(obj.hashCode());
        System.out.println(obj.indexOf("c"));
        System.out.println(obj.concat("paras"));
        System.out.println(obj.split(obj));
        System.out.println(obj.charAt(6));
        System.out.println(obj.replace("el","pl"));
        System.out.println("welcome".substring(4));
        System.out.println(obj.compareTo(obj1));// if they are equal return zero
       

    }
}