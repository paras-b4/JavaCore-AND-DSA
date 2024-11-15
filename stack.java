public class stack // stack real life example :- Undo , back button ,pile of money, deck of card ,pile of book .
{
    int stack[]= new int[5];
    int top=0;
    public void push(int data)
    {
        if (top==5)
        {
            System.out.println("stack is full");
            
        }
        else{
        stack[top]=data;
        top++;}
    }
    public int pop()
    {
        if (isempty())
        {
            System.out.println("empty stack");
        }
        int data;
        top--;
        data=stack[top];
        stack[top]=0;
        return data;
    }
    public int peek()
    {
        int data;
        top--;
        data= stack[top];
        return data;
    }
    public void size()
    {
        top++;
        System.out.println("size :"+top);
    }
    public boolean isempty()
    {
        return top<=0;

    }
    public void show()
    {
        for(int n: stack ){
        System.out.print(n+" ");}
        System.out.println();
        
    }
    
   
}
