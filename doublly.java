public class doublly {
    int size;
    node head,tail;



    public boolean isempty()
    {
        return (size==0);
    }
    public int size()
    {
        
        return size;
    }
    public void addfirst(Object data)
    {
        node newnode=new node(data);
        if (head==null)
        {
            head=newnode;
            tail=newnode;

        }
        else{
            newnode.next=head;
            head.previous=newnode;
            head=newnode;

        }
        size++;
    }
    public void addlast(Object data)
    {
        node newnode=new node(data);

        if (tail==null)
        {
            head=newnode;
            tail=newnode;

        }
        else{
            tail.next=newnode;
            newnode.previous=tail;
            tail=newnode;
        }
        size++;
    }
    public void displayforward()
    {
        if(head==null)
        {
            System.out.println("LL is empty");
        }
        else{
            System.out.println("display forward");
            node temp=head;
            while(temp!=null )
            {
                System.out.println(temp.data+ " ");
                temp=temp.next;
            }
        }
    }
    public void displaybackward()
    {
        if (head==null)
        {
            System.out.println("ll is empty");
        }
        else{
            System.out.println("display backward");
            node temp=tail;
            while(temp!=null)
            {
                System.out.println(temp.data+" ");
                temp=temp.previous;
            }
        }
    }
    public boolean remove(Object data)
    {
        if(head==null)
        {
            return false;
        }
        else if (head.data==data)
        {
            if (head==tail)
            {
                head=null;
                tail=null;
            }
        
        else{
            head=head.next;
            head.previous=null;
        }
        size--;
        return true;
       }
       node temp= head.next;
       while(temp!=tail && temp!= null)
       {
         if (temp.data==data)
         {
            temp.previous.next=temp.next;
            temp.next.previous=temp.previous;
            size--;
            return true;
         }
         temp=temp.next;
       }
       if (tail.data==data)
       {
        tail=tail.previous;
        tail.next=null;
        size--;
        return true;
       }
       return false;


    }
    private class node{
       
         Object data;
        node previous,next;

        private node(Object d)
        {
            data=d;
            previous=null;
            next=null;
            

        }

    }
}
class main{
   public static void main(String[] args) {
        doublly list=new doublly();
        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(30);
        list.addfirst(40);
        list.addfirst(50);
        list.addlast("paras yadav");
        list.remove(40);
        list.displayforward();
        list.displaybackward();
        list.remove(40);
        list.displayforward();
        
        

    }
}


    

