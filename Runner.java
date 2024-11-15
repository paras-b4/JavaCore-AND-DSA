public class Runner {
    public static void main(String[] args) {
       Linkedlist list=new Linkedlist();
       list.insert(8);// in linked list we have insert and delete,show operation 
       list.insert(9);
       list.insert(7);
       list.insert(4);
       list.insertAtStart(5);
       list.insertAtStart(6);
       list.insertAt(4,10);
       list.insertAt(0,20);
       list.show();

       list.deleteAt(5);
       list.deleteAtEnd();
       list.deleteAtStart();
      
       list.show();



    }
}
