public class queue  // Queue real life example are :- cpu schedulling , handle website traffic , media player 
{
    int paras[]=new int [5];
    int rear;
    int front;
    int size;

    public void EnQueue(int data)
    {
        paras[rear]=data;
        rear=(rear+1)%5;
        size=size+1;
    }
    public int deQueue()
    {
        int data;
        
        data=paras[front];
        front=(front+1)%5;
        size=size-1;
        return data;
    }
    public void getsize()
    {
        
        System.out.println("size : " + size);
    }
    public boolean isempty()
    {
        return size==0;
    }
    public void show()
    {
        System.out.print("elements : ");
        for(int i=0;i<size;i++)
        {
            System.out.print (paras[(front+i )%5]+" ");
        }
        for(int n: paras)
        System.out.println(n+" ");
    }
}
