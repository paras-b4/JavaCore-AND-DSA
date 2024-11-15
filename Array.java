/*
 Array is a Group of similar elements or data items of the same type collected at contiguous memory location .
 each variable in array has an index value starting from 0 .
--> types of array
1. 1 D
2. 2 D
3. multidimention array
--> Array declaration = In array declarartion we only declare the array not allocating the memory .
--> Array initilisation = In  Array initilisation we are allocation the memory to the array .
--> we can initilize the array in two ways 
   1.user define array (dynamic at run time )
   2.Already known value( while writting the  code ) 

 */
// Already known values (while writting the code)

import java.util.Scanner;

class demo
{
    public static void main(String[] args) {
        int arr[]={8,9,6,4,5,1};
        int arr1[]=new int []{8,9,6,4,5,1};
        for(int n:arr)
        {
            System.out.print(n+" ");
        }
        System.out.println();
        for(int n:arr1)
        {
            System.out.print(n+" ");
        }
    }
}
// (User defined array) or (creating an array)

class main
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s=obj.nextInt();
        int arr[]=new int [s];
        System.out.println("Enter values in array");
        for (int i=0;i<s;i++)
        {
            arr[i] = obj.nextInt();
           
            
        }
        System.out.println();
        for(int n:arr)
        {
            System.out.print(n+" ");
        }

        
    }
}
// Insertion in 1D array 
class main1
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter size of an array");
        int a=obj.nextInt();
        int A[]=new int [a];
        int B[]=new int [a+1];
        System.out.println("enter the values");
        for(int i=0;i<a;i++)
        {
            A[i]=obj.nextInt();
        }
        System.out.println("Enter the the index for new value");
        int c=obj.nextInt();
        System.out.println("enter the value");
        int d=obj.nextInt();
        for(int i=0;i<a+1;i++)
        {
            if(i<c )
            B[i]=A[i];
            else if (i==c)
            B[i]=d;
            else
            B[i]=A[i-1];
        }
        for(int i=0;i<a+1;i++)
        {
            System.out.print(B[i]+ " ");
        }
    }
}
// Deletion in 1D array
class main2
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int a=obj.nextInt();
        int A[]=new int [a];
        System.out.println("Enter the value");
        for(int i=0;i<a;i++)
        {
            A[i]=obj.nextInt();
        }
        System.out.println("enter the index for which the value will be deleting");
        int c=obj.nextInt();
        int B[]=new int[a-1];
        for (int i=0;i<A.length;i++)
        {
            if (i<c)
            B[i]=A[i];
            else if(i==c)
            i++;
            else
            B[i-1]=A[i];
        }

        for(int j=0;j<a-1;j++)
        {
            System.out.print(B[j]+" ");
        }

    }
}

// (2D array user define)or (creating of 2D array)
class paras
{
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter rows");
        int r=obj1.nextInt();
        System.out.println("enter column");
        int c= obj1.nextInt();
        int arr1[][]=new int[r][c];
        System.out.println("Enter values in array");
        for(int i=0;i<r;i++)     // when i=0 , when i=1 ,when i=3
        {
            for(int j=0;j<c;j++)  // then j=0,1 arr[0][0],arr[0][1]   // then j=0,1 arr[1][0],arr[1][1]  // then j=0,1 arr[3][0],arr[3],[1]
            {
                arr1[i][j]=obj1.nextInt();

               
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr1[i][j]+" ");

               
            }
            System.out.println();
        }

    }
}



