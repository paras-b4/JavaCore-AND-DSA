public class Runner4 {
    public static void main(String[] args) {
        Doubley_LL D=new Doubley_LL();
        D.insert(10);
        D.insert(20);
        D.insert(30);
        
        D.insert(40);
        D.insert(50);
        
        
        //D.insertAtStart(80);
        D.insertAt(1,90);
        D.show();
        D.deleteAtStart();
        
        D.show();
        D.deleteAt(4);
        
       
        D.delete();
        D.show();
       
       
        
       
      

        

        
    
    
    }   
    
}
