// Threads are usefull when you want to execute multiple thing at the same time .
//mutation simply means that you can change somthing .
//primitive type variable and primitive type object are mutation as their value can change .
//String are immutable as we cannot change their value of it .
// couse of thread and mutation at the same time is not good as it create insabitity in the code .  
class c 
{
    int counter=0;
    public synchronized void inccrement()
    {
        counter++;
    }
}
class main
{
    public static void main(String[] args) throws InterruptedException
        {
        c obj1=new c();
        Runnable obj = ()->
        {
            for (int i = 0; i <=1000; i++) {
                 
                obj1.inccrement();
            }
        };
        Runnable obj2 = ()->
        {
            for (int i = 0; i <= 1000; i++) {
                 
                obj1.inccrement();
            }
        };
        Thread t=new Thread(obj);
        Thread t1=new Thread(obj2);
        t.start();
        t1.start();
        Thread.sleep(10);

        System.out.println(obj1.counter);

    }
}


