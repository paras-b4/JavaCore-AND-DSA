public class circular_LL
{
    node head;
    node tail;
    public void insert(int data)
    {
        node newnode=new node();
        newnode.data=data;
        newnode.next=null;

        if(head==null)
        {
            head=newnode;
            tail=newnode;
            newnode.next=head;

        }       
        else{
            tail.next=newnode;
            tail=newnode;
            newnode.next=head;


        } 
       
    }
    public void insertAtStart(int data)
    {
        node newnode=new node();
        newnode.data=data;
        newnode.next=null;
       
        if(head==null)
        {
            System.out.println("LL doesnot exist");

        }
        else{
            newnode.next=head;
            head=newnode;
            tail.next=head;

        }
    }
    public void insertAt(int index,int data)
    {
        node newnode=new node();
        newnode.data=data;
        newnode.next=null;
        node temp=head;
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;

        }
        newnode.next=temp.next;
        temp.next=newnode;
        System.out.println(tail.next==head);


    }
    public void deleteAtStart()
    {
        node temp=head;
        temp=temp.next;
        head=temp;
      //  head=head.next;
        tail.next=head;

    }
    public void delete()
    {
        node temp=head;
        node ptr=temp.next;
        while (ptr.next!=head) 
        {
            temp=ptr;
            ptr=ptr.next;  
        }
        temp.next=head;
        tail=temp;
        System.out.println("deleted element : "+ptr.data);

    }
    public void deleteAt(int index)
    {
        node temp=head;
        node ptr=temp.next;
        for(int i=0;i<index-1;i++)
        {

            temp=ptr;
             ptr=ptr.next;
        }
        temp.next=ptr.next;
        System.out.println("element deleted : "+ ptr.data);


    }

 

    public void show()
    {
        node temp1=head;
        if(head==null)
        {
            System.out.println("LL does not exist");

        }
        else{
            do{
                System.out.println(temp1.data+" ");
                temp1=temp1.next;

            }
            while(temp1!=head);
        }
        
      

    }
        
    
}
