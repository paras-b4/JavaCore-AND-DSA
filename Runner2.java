public class Runner2 {
    public static void main(String[] args) {
        circular_LL c=new circular_LL();
        c.insert(10);
        c.insert(20);
        c.insert(30);
        c.insert(60);
        c.insertAtStart(40);
        c.insertAt(0,50 );
        c.show();
        c.deleteAtStart();
        c.delete();
        c.show();
        c.deleteAt(2);
        c.show();


    }
    
}
