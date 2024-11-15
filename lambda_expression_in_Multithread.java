// Lambda expression provides a clear and concise way to represent one method interface using expression it is very usefull in collection library
// Lambda expression provides implementation of functional interface
// class A implements Runnable
// {
//     public void run()
//     {
//         for (int i = 0; i< 5; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();

//             }
            
//         }
//     }
// }

// class B implements Runnable
// {
//     public void run()
//     {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(i);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
            
//         }
//     }
// }
class main
{
    public static void main(String[] args) {
        Runnable obj =()->
        {
         
        for (int i = 0; i< 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }
            }
        };
    
        Runnable obj1=() ->
         {
         for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(i);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }

        
        Thread t=new Thread(obj);
        Thread t1=new Thread(obj1);
        t.start();
        t1.start();
        t.join();
    }
}
