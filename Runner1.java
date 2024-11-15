class Runner1
{
    public static void main (String[] arg)
    {
        stack nums=new stack();
        nums.push(8);
        nums.show();
        nums.push(7);
        nums.show();
        nums.push(9);
        nums.show();
        nums.push(3);
        nums.show();
        nums.push(10);
        nums.show();
        nums.push(15);
        nums.show();
        int a=nums.pop();
        System.out.println(a);
        boolean b=nums.isempty();
        System.out.println(b);
        nums.size();
        int a1=nums.pop();
        System.out.println(a); 
        nums.show();
        int c=nums.peek();
        System.out.println("peek : "+ c);


    }
}
