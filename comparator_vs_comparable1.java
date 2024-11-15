import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* 
public class comparator_vs_comparable // comparator is a functional interface so that we can use annonymous class we have to initilize <integer> on left hand side .
{
    public static void main(String[] args) {
        Comparator<Integer> com=new Comparator<Integer>() { // if we want to sort list with our own logic than we use comparator , comaprable.
            public int compare(Integer i,Integer j)
            {
                if (i%10 > j%10)
                {
                    return 1;
                }
                return -1;
            }
            
        };
        List<Integer> nums =new ArrayList<>();
        nums.add(91);
        nums.add(15);
        nums.add(62);
        nums.add(26);
        nums.add(9);
        Collections.sort(nums,com); // here collections is a class on that there are lot of methods like sort in which we pass the list which we need to sort
        System.out.println(nums);

    }
}
*/
class student
{
    int age;
    String name;

    public student(int age, String name)
    {
        this.age=age;
        this.name=name;

    }
    public String toString()
    {
        return "student[age =" +age+" name="+name+"]";
    }
}
public class comparator_vs_comparable1 // comparator is a functional interface so that we can use annonymous class we have to initilize <integer> on left hand side .
{
    public static void main(String[] args) {
        Comparator<student> com=new Comparator<student>() { // if we want to sort list with our own logic than we use comparator , comaprable.
            public int compare(student i,student j)
            {
               /*  if (i.age > j.age)
                {
                    return 1;
                }
                else*/ if (i.name.length()> j.name.length()){
                    return 1;
                }
                else{
                    return -1;
                }
                
            }
            
        };
        List<student> nums =new ArrayList<>();
        nums.add(new student(22, "paras"));
        nums.add(new student(15, "jack"));
        nums.add(new student(18, "oggy"));
        nums.add(new student(20,"john"));
        nums.add(new student(23,"kevin"));
        Collections.sort(nums,com); // here collections is a class on that there are lot of methods like sort in which we pass the list which we need to sort
        for(student s: nums)
        System.out.println(s);

    }
}

