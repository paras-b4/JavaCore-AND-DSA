//if i am using or inherite the method of one class in other class which is written in separate file then we use the public befor defining the class 
// if i am using or inheriting the method of one class in other class written in same file then no need to use the public keyword.
// java does not support multiple inheritance by there are some in direct way for performing it.
class Calc
{
    public int add(int a,int b)
    {
        return a + b ;
    }
    public int sub(int c ,int d)
    {
        return c - d ;
    }
    
}
class AdvCalc extends Calc // SINGLE INHERITANCE
{
    public int multi(int e , int f)
    {
        return e * f;

    }
    public double div( int g,int h)
    {
        return g/h;
    }
    
}
class VeryAdvCalc extends AdvCalc //  MULTILEVEL INHERITANCE
{
    public double Pow(int m,int n)
    {
        return  Math.pow(m,n);
    }
}
class j 
{
    public static void main(String[] args)
    {
        VeryAdvCalc obj= new VeryAdvCalc();
        int r1=obj.add(5,5);
        int r2=obj.sub(8,4);
        int r3=obj.multi(5,5);
        int r4=(int)obj.div(8,4);
        double r5=obj.Pow(2,3); // gives double value 
        System.out.println(r1 + "," + r2 + ","+ r3 +","+ r4 +","+ r5);

    }
}


