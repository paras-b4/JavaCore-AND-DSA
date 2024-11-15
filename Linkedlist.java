public class Linkedlist
 {
    node head;
    public void insert(int data)
    {
        
        node newnode=new node(); 
        newnode.data=data;
        newnode.next=null;
        
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            node temp= head;
            while(temp.next!=null )
            {
                temp= temp.next;

            }
             temp.next=newnode;

        }
    }
    public void insertAtStart(int data)
    {
        node newnode=new node();
        newnode.data=data;
        newnode.next=null;     

        newnode.next=head;
        head=newnode;

    }
    public void insertAt(int index,int data)
    {
        node newnode=new node();
        newnode.data=data;
        newnode.next=null;
        if (index==0)
        {
            insertAtStart(data);
        }
        else{
        node temp=head;
        for(int i=0;i<index-1;i++)
        {
            temp=temp.next;
          
        }
        newnode.next=temp.next;
        temp.next=newnode;}
    }
    public void deleteAt(int index)
    {
        if(index==0)
        {
            head=head.next;
        }

       else{
            node temp=head;
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            node nextnode=temp.next;
            temp.next=nextnode.next;
            System.out.println("value deleted : "+nextnode.data);
        }}
    public void deleteAtEnd()
    {
        node prevnode=null;
        node temp=head;
        while(temp.next!=null)
        {
            prevnode=temp;
            temp=temp.next;
            

        }
         prevnode.next=null;

    }
    public void deleteAtStart()
    {
        head=head.next;
    }

    public void show()
    {
        node temp= head;
        while(temp.next!=null)
        {
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
        System.out.println(temp.data + " ");
    }
}
    

