class Main
{
    public static void main(String[] args) {
        int arr[]={2,6,4,5,3,8,7};
        int size= arr.length;
        int minindex=-1;
        int temp=0;
        System.out.println("Array before sorting : ");
        for (int n: arr)
        System.out.print(n);

        for(int i=0;i<size-1;i++)
        {
            minindex=i;
            for(int j=i+1;j<size;j++)
            {
                if (arr[minindex]>arr[j])
                {
                    minindex=j;
                }
               

            }
            temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;

        }
        System.out.println("Array after sorting : ");
        for (int n: arr)
        System.out.print(n);

    }
}