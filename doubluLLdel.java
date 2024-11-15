import java.util.Scanner;

public class doubluLLdel {
    static class node
    {
        int data;
        node previous;
        node next;

        node(int data)
        {
            this.data=data;
            this.next=null;
            this.previous=null;


        }

    }
    node head=null;
    node tail=null;

    public void creation()
    {
        int data,p,n,c;
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
                tail=tail.previous;
                tail.next=null;
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
        if(head==null)
        {
            System.out.println("ll is empty");

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
class main
{
    public static void main(String[] args) {
        doubluLLdel list=new doubluLLdel();
        list.
    }
}
