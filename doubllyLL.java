import java.util.Scanner;

public class doubllyLL {
 
    
    
    static class node{
        int data;
        node next;
        node previous;

        node(int data)
        {
            this.data=data;
            this.next=null;
            this.previous=null;

        }

    }
    node head=null;
    node tail=null;
    public void create()
    {
        int n,data,c,p;
       
        Scanner sc=new Scanner(System.in);
       do{
        System.out.println("Enter data");
        data=sc.nextInt();
        node newnode=new node(data);
        
        if(head==null)
        {
            head=newnode;
            tail=newnode;

        }
        else{
            
        
        System.out.println("enter 1 to insert the element at start, 2 to insert at end,3 to insert at index");
        c=sc.nextInt();
        switch (c) {
            case 1:
             newnode.next=head;
             head.previous=newnode;
             head=newnode;
              break;
            case 2:
             tail.next=newnode;
             newnode.previous=tail;
             tail=newnode;
             break;
             case 3:
             System.out.println("enetr the index at which you want to insert data");
             p=sc.nextInt();
             node temp1=head;
             node ptr=temp1.next;
             for(int i=0;i<(p-1);i++)
             {
                temp1=ptr;
                ptr=ptr.next;
             }
             newnode.previous=temp1;
             newnode.next=ptr;
             temp1.next=newnode;
             ptr.previous=newnode;
             break;

            default:
            System.out.println("wrong input");
                break;
        }
        }
     System.out.println("do you want to add more data . if yes , press : 1 ");
    n=sc.nextInt();
    } while(n==1);

}
public void deletion()
{
    int p,n,c;
    Scanner sc=new Scanner(System.in);
    do{
   
    if(head==null)
    {
      System.out.println("ll is empty");
    }
    else{
        System.out.println("enter the 1 for deletion at start, 2 for deletion at end , 3 for deletion at index ");
        n=sc.nextInt();
        switch (n) {
            case 1:
            head=head.next;
            head.previous=null;
                break;
            case 2:
           /*  node temp2=tail;
            temp2=temp2.previous;
            temp2.next=null;*/
            tail=tail.previous;
            tail.next=null;
            break;

            case 3:
            System.out.println("Enter the index at which you want to delete the value");
            p=sc.nextInt();
            node temp=head;
            node ptr=temp.next;
            for(int i=0;i<(p-1);i++)
            {
                temp=ptr;
                ptr=ptr.next;

            } 
            temp.next=ptr.next;
            ptr.next.previous=temp;
            break;
        
            default:
            System.out.println("wrong input");
                break;
        }
    }
    System.out.println("do you want to delete more element . if yes , press 1 ");
    c=sc.nextInt();

}while(c==1);

}

    public void traverser()
    {
        node temp=head;
        if (head==null)
        {
            System.out.println("LL is empty");

        }
        else{
            while(temp!=null)
            {
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    

    
}

class main{
    public static void main(String[] args) {
        doubllyLL list=new doubllyLL();
        list.create();
        list.deletion();

        list.traverser();
    }
}
