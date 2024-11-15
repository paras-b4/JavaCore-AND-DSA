import java.util.Scanner;

public class BinarytreeUsingLL {  // Tree real life example are :- sorting algorithms , data compression (huffman encoding)

    static class node{
        int data;
        node left;
        node right;
    
    public node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;

    }
}
    public static  node create()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value");
        int data=sc.nextInt();
        node root=new node(data);
        if(data==-1)
        
            return null;
        System.out.println("Enter the left chile of : "+ root.data);
        root.left=create();
        System.out.println("enter the right chile of  : "+ root.data);
        root.right=create();
        return root;


        
    }
    public static  void inorder(node root)
    {
        if (root==null)
        return;
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }
    public static void preorder(node root)
    {
        if(root==null)
        return;
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void postorder(node root)
    {
        if(root==null)
        return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }
    public static void main(String[] args) {
        node root=create();
        inorder(root);
       

        
        preorder(root);

        postorder(root);


    }
    
}
