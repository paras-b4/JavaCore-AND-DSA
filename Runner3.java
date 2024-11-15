public class Runner3 {
    public static void main(String[] args) {
        queue obj=new queue();
        obj.EnQueue(5);
        obj.EnQueue(9);
        obj.EnQueue(6);
        obj.EnQueue(4);
        obj.EnQueue(7);

        
        obj.deQueue();
      

        obj.EnQueue(98);
        obj.EnQueue(87);
        obj.EnQueue(77);
        obj.EnQueue(90);
        obj.EnQueue(84);
        obj.EnQueue(76);
        obj.getsize();
        boolean b = obj.isempty();
        System.out.println(b);
        obj.show();


    }
    
}
