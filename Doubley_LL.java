public class Doubley_LL {
    node1 head;
    node1 tail; 
    node1 prev;
    int size;


    public void insert(int data)  // insert at the end 
    {
        node1 newnode=new node1(data);
       

        if(head==null)
        {
           // insertAtStart(data);
        }
        else
        {
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;

        }

        
    }
    /* 
    public void insertAtStart(int data)       // insert at the start
    {
        node1 newnode=new node1(data);
      

        newnode.next=head;
        head.prev=newnode;
        head=newnode;


    }*/
    public void insertAt(int index,int data)
    {
        node1 newnode=new node1(data);
       
        if (index==0)
        {
           // insertAtStart(data);
        }
        else{
        node1 temp=head;
        node1 ptr=temp.next;
        for (int i=1;i<index-1;i++)
       
        {
            temp=ptr;
            ptr=ptr.next;
            
        }
        newnode.prev=temp;
        newnode.next=ptr;
        temp.next=newnode;
        ptr.prev=newnode;}
        
    }
   
    public void deleteAtStart()
    {
        System.out.println("element deleted : "+ head.data);
        head=head.next;
        

    }
    public void deleteAt(int index)
    {
        node1 temp=head;
        node1 ptr=temp.next;
        for(int i=1;i<index-1;i++)
        {
            temp=ptr;
            ptr=ptr.next;

        }
        System.out.println("deleted element : " + ptr.data);
        temp.next=ptr.next;
        ptr.next.prev=temp;
        
    }
    public void delete()
    {
        node1 temp=tail;
        tail=tail.prev;
        tail.next=null;
        temp.prev=null;    
    }
    public void show()
    {
        node1 temp =head;
        if( head==null)
        {
            System.out.println("LL does not exist");
        }
        else{
             while(temp!=null)
             {
                System.out.println(temp.data + " ");
                temp=temp.next;
             }
        }
    }
    
}
