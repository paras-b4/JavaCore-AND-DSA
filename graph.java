import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;         // Graph real life example are :- Google maps , facebook/Instagram , computer networking  
import java.util.Queue;

public class graph {
    public LinkedList<Integer> adjacence[]; // declare an array of LInkedList to store adjacency list
    @SuppressWarnings("unchecked")
    public graph(int v) // constructor to initilize the adjacency list for each vertex .
    {
        adjacence=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adjacence[i]=new LinkedList<Integer>();
        }
    }
    public void insertedge(int s ,int d)
    {
        adjacence[s].add(d);
        adjacence[d].add(s);

    }
    public void bfs(int source)// Bfs search level by level or we can say breadthwise
    {
        boolean visitednode[]=new boolean [adjacence.length];// we are initilizing two array and one queue 
        int parentnode[]=new int[adjacence.length];
        Queue<Integer> q=new LinkedList<>();
        q.add(source); // Adding source to the quque
        visitednode[source]=true; // making source true
        parentnode[source]=-1; //
        while(!q.isEmpty())
        {
            int p=q.poll();
            System.out.println(p);
            for(int i:adjacence[p])
            if(visitednode[i]!=true)
            {
                visitednode[i]=true;
                q.add(i);
                parentnode[i]=p;
            }
        

        }

        
    }

    public void dfs(int source1)// Dfs search depthwise
    {
        boolean visitednode[]=new boolean [adjacence.length];
        int parentnode[]=new int[adjacence.length];
        Stack<Integer> q=new Stack<>();
        q.add(source1); 
        visitednode[source1]=true; 
        parentnode[source1]=-1; //
        while(!q.isEmpty())
        {
            int p=q.pop();
            System.out.println(p);
            for(int i:adjacence[p])
            if(visitednode[i]!=true)
            {
                visitednode[i]=true;
                q.add(i);
                parentnode[i]=p;
            }
        

        }

        
    }
   
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter no of edge and vertices");
        int v=obj.nextInt();
        int e=obj.nextInt();
        graph g=new graph(v);
        System.out.println("enter edges");
        for(int i=0;i<e;i++)
        {
            int s=obj.nextInt();
            int d=obj.nextInt();
            g.insertedge(s, d);
        }
        // System.out.println("Enter the source for traversal");
        // int source=obj.nextInt();
        // g.bfs(source);
        // System.out.println("Enter the source for traversal");
        // int source1=obj.nextInt();
        // g.dfs(source1);

       
    }
    
}
