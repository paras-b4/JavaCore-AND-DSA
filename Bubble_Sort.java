
class Bubble
{
    public static void main(String[] args) {
        int arr[]={6,5,2,8,9,4};
        int size= arr.length;
        int temp=0;
        System.out.println("Array before soting : " );
       
        for(int n:arr)
         System.out.print(n);

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if( arr[j]>arr[j+1])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    
                }
                

            }
        }
        System.out.println();
        System.out.print("Array after sorting : ");
        for(int n: arr)
        System.out.print(n);
        


        

        

    }
    
}
