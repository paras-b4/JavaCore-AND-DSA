/*
when we create an application we use framworks and behind the scene ,these framwork will create thread
if you want to execute two behaviour(method) at the same time then we can you thread 
Multithreading allows concurrent execution of two or more part of a program foe maximum utilization of cpu.
 each part of such program is called thread
we can not use/execute normal object in multiple threads or normal object cannot be executed simultaneously

 java provides a thread class to achive thread programing .thread class consist of constructor and method to create and perform
 operation in thread.
 start() is a method that is present inside the thread class .start() method only call the run() method.
 start() method invokes the run() method on the thread object .
 --> Commonly used Constructor of thread
  1.thread(string name)
  2.thread(runnable r)
  3.thread(runnable,string name)
-->Commonly use method 
1. public void run()
2.public void start()
3.public void sleep()= cause the currently executing thread to sleep for milliseconds .
4.public void join()= wait for a currently executing  thread to die .
5.public void isAlive()= test if the thread is alive.
6.public int getPriority()= return the priority of the thread (max,min,nom) Normal Priority is 5 and we have range of priority from (1 to 10)
7. public int setPriority()= change the priority of the thread.
8.public String setName() =change the name of the thread
9.public String getname()= return the name of the thread.

 */

import java.io.IOException;

class A extends Thread
{
    public void run() 
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep( 10);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
    

        }
        
        
    }
}
class B extends Thread
{
    public void run ()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("hellow");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        }
        
    }
}
class main
{
    public static void main(String[] args) throws InterruptedException{
        A obj=new A();
        B obj1=new B();
        System.out.println(obj.getPriority());
        obj.setPriority(3);
        obj.start();

        

        
        obj1.start();
        
        
        
    }
}
 
class C implements Runnable
{
    public void run()
    {
        System.out.println("thread is running");
    }
}
class v
{
    public static void main (String[] args)
    {
        Runnable r=new C();
        Thread t=new Thread(r,"my thread");
        t.start();
        t.getPriority();
        t.setPriority(7);
        String name=t.getName();
        System.out.println(name);
        t.getName();
        t.getPriority();


    }
}

class D extends Thread
{
     public void run()
     {
        System.out.println("my first thread");
     } 
}
class x
{
    public static void main(String[] args) {
         D obj=new D();
        obj.start();
    }
}


class mutlithred extends Thread
{
    public void run()
    {
        try {
           

                System.out.println("Thread   "+ Thread.currentThread().threadId()+"   is running");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
class f 
{
    public static void main(String[] args)
    {
        for(int i=0;i<=10;i++){
        
             mutlithred obj=new mutlithred();
             obj.start();
             
          }
          
        }


}

class mutlithred1 implements Runnable
{
    public void run()
    {
        try {
           

                System.out.println("Thread   "+ Thread.currentThread().getName() +"   is running");
                
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
class f1

{
    public static void main(String[] args)
    {
        for(int i=0;i<=10;i++){
            //Runnable r1= new Multithread();
             Thread obj=new Thread( new mutlithred1(),"Thread");
             obj.start();             
          }
         
        }


}


          
class D1 extends Thread
{
     public void run()
     {
        System.out.println("my first thread");
     } 
}
class x1
{
    public static void main(String[] args) {
         D1 obj=new D1();
        obj.start();
        String name= obj.getName();
          System.out.println(name + Thread.currentThread().getName());
          obj.setName("hello");
          System.out.println("name after set : "+ obj.getName());
          obj.getPriority();
          obj.setPriority(8);
          obj.setName("paras");

          

    }
}