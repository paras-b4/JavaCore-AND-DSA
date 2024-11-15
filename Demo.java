//import tools.calcu;
//import tools.AdvCalcu;
import tools.*;
public class Demo
{
    public static void main(String[] args) {
        //calcu obj1 = new calcu();
        AdvCalcu obj = new AdvCalcu();

        int r1=obj.add(5,5);
        int r2=obj.sub(8,4);
        int r3=obj.multi(5,5);
        int r4=(int)obj.div(8,4);
        double r5=obj.power(2,3);
        System.out.println(r1+","+r2+","+r3+","+r4+","+r5);

    }
}