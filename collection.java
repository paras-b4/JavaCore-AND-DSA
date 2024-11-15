/*
 In java collection consist of 
 1. Collection API also called collection frame work - concept
 2. collection - interface
 3. Collections - class
 A framwwork is a set of class and interface which provides a ready-made architecture.
 ->collection is used to store multiple value .
 ->Array is also used to store multiple values. but it is not used in dynamic programing .
 THe collection in java is a framework that provide an architecture to store and manipulate the group of object.
 java collection means a single unit of object . java collection framework provides many interface (set,list,queue,deque) and classes
 (Arraylist,vector,linkedlist,priorityQueue,HashSet,TreeSet).
--> collection is the interface where you group objects into a single unit . 
-->collections is a class that has some set of operation you perform on collection .
the collection interface is the interface which is implemented by all classes in the collection framework.

1.list interface--> List interface is implemented by the classes ArrayList,LinkedList,Vector,Stack. it is a data structure in which we store ordered collection of object 
it can have duplicate object .
->ArrayList = The ArrayList class implements the list interface .it uses a dynamic array to store the element of different data type .
the arraylist class maintain the insertion order and is non synchronized .
-->LinkedList = LinkedKist uses a doubly linked List internally to store the elements . it maintain the insertion order and is synchronoized
-->Vector = Vector uses a dynamic array to store the data element . it is synchronoized and contain many method that are not the part of collection framework .
-->Stack = the stack is the subclass of vector. it implements the last-in-first-out data structure . The stack containa all the method of vector class .
2. Queue interface = Queue interface maintains the first-in-first-out order . it can be defined as an ordered list that is used to hold the element which are about to be processed .
there are various classes like PriorityQueue ,Deque and ArrayDeque which implements the queue interface .
3. Set interface = set interface extends the collection framework. it represent the unordered set of element which doesnot allow us to store duplicate items . we can store atmost one null value in set.
set is implemented by HashSet,TreeSet . it doesnot support index

// Map does not extends  collection interface but it is a part of collection concept .
// Map is a collection of key value pair for every value of an element a key is associated with it 
// Map itself is an interface that support key-value pairs. a class that implements Mapis called HashMap .
// In map we can fetch value form it by using the key and we get value .
// we can add elements in a map using the put() method
// keys are unique but values can be repeated . the vaue can be updated
// In map keys are in set while values are in list .


 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;

import java.util.Map;

import java.util.Stack;
class main 
{
    public static void main(String[] args) {
        Collection<Integer> num = new ArrayList<Integer>();// if we want to work with index value using List insted of collection .
        // collection interface doesnot support index value .
        num.add(24);
        num.add(23);
        num.add(27);
        num.add(03);
        num.add(98);
        System.out.println(num); 
        for(int n1:num)
        System.out.println(n1*2);
        
        for (Object n: num){
            int nums=(Integer)n; 
            System.out.println(nums*2);
        }
        Iterator<Integer> itr=num.iterator();
        while(itr.hasNext())

        System.out.println(itr.next());
    }
}



class main1 
{
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();// if we want to work with index value using List insted of collection .
        // collection interface doesnot support index value .
        num.add(24);
        num.add(23);
        num.add(27);
        num.add(03);
        num.add(98);
        System.out.println(num.remove(2)); 
        System.out.println(num.add(99)); 
        System.out.println(num.get(3)); 
        System.out.println(num.indexOf(99)); 
        System.out.println(num);
        System.out.println(num.set(0,99));
        for(int n1:num)
        System.out.println(n1*2);
        
         for (Object n: num){
             int nums=(Integer)n; 
           System.out.println(nums*2);
         }
        Iterator<Integer> itr=num.iterator();
         while(itr.hasNext())

         System.out.println(itr.next());
         for (int i=0;i<num.size();i++)
         {
         System.out.println(num.get(i));
         }
    }
}
    


class main3 
{
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<Integer>();//similarly LinkedList,Stack
        num.add(24);
        num.add(23);
        num.add(27);
        num.add(03);
        num.add(98);
         System.out.println(num.remove(2));
         System.out.println(num.hashCode()); 
        num.push(45);//Pushes an item onto the top of this stack. This has exactly the same effect as:
        System.out.println(num);
        num.pop(); //Removes the object at the top of this stack and returns that object as the value of this function.
         System.out.println(num.add(99)); 
         System.out.println(num.get(3)); 
         System.out.println(num.indexOf(99)); 
        System.out.println(num);
         for(int n1:num)
         System.out.println(n1*2);
        
         for (Object n: num){
             int nums=(Integer)n; 
             System.out.println(nums*2);
         }
         Iterator<Integer> itr=num.iterator();
         while(itr.hasNext())

         System.out.println(itr.next());
    }

}
 


class paras
{
        public static void main(String[] args) {
            
            Stack<String> str=new Stack<String>();
            str.push("john");
            str.push("ronnie");
            str.push("bob");
            str.push("jack");
            System.out.println(str);
            
            Iterator itr=str.iterator();
            while(itr.hasNext())
            System.out.println(itr.next());
            for(Object n: str ){
                int str1=(Integer)n;
                System.out.println(str1);
            }

        }
}


class dog 
{
    
    public static void main(String[] args) {
        Set<String> str= new HashSet<String>();
        str.add("paras");
        str.add("john");
        str.add("steve");
        str.add("hennery");
        str.add("paras");
        str.add("peter");
        str.add("markus");
        System.out.println(str.getClass()); // it gives the class anme
        System.out.println(str.isEmpty()); // it identifies whether the class is empty or not
        //System.out.println(str.removeAll(str));// it removes all elements from set
        
        
        System.out.println(str.contains("paras"));// it identifies whether "paras" is present in the set or not .
        Iterator<String> itr=str.iterator();
        while(itr.hasNext())

        
        System.out.println(itr.next());

        
    }
}





class dog1 
{
    
    public static void main(String[] args) {
        Set<Integer> str= new TreeSet<Integer>();// treeset class extends the abstract class and implements the navigableset class 
        str.add(45);
        str.add(89);
        str.add(475);
        str.add(32);
        str.add(61);
        str.add(96);
        str.add(58);
        System.out.println(str.getClass()); // it gives the class anme
        System.out.println(str.isEmpty()); // it identifies whether the class is empty or not
        
        //System.out.println(str.removeAll(str));// it removes all elements from set
        
        
        System.out.println(str.contains("paras"));// it identifies whether "paras" is present in the set or not .
        Iterator<Integer> itr=str.iterator();
        while(itr.hasNext())

        
        System.out.println(itr.next());

        
    }
}

// Map does not extends  collection interface but it is a part of collection concept .
// Map is a collection of key value pair for every value of an element a key is associated with it 
// Map itself is an interface that support key-value pairs. a class that implements Mapis called HashMap .
// In map we can fetch value form it by using the key and we get value .
// we can add elements in a map using the put() method
// keys are unique but values can be repeated . the vaue can be updated
// In map keys are in set while values are in list .



class demo
{
    public static void main(String[] args) {
        Map<Integer,String > num=new HashMap<Integer,String>();
        num.put(100,"paras");
        num.put(95,"sam");
        num.put(45,"joe");
        num.put(49,"keiven");
        num.put(65,"ronnie");
        num.put(10, "joe");
        System.out.println(num.get(100));
        System.out.println(num.entrySet());
        System.out.println(num.values());
        System.out.println(num.keySet());
        for( Integer s:num.keySet())
        {
            System.out.println(num.get(s)+" | "+ s);


        }



    }
}