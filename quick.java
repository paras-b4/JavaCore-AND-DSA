public class quick {
    public static void main(String[] args) {
        int nums[]={8,9,7,3,5,6};
        System.out.println("before sorting : ");
        for(int n: nums)
        {
            System.out.print(n+" ");
        }
        quicksort(nums,0,nums.length-1);
        System.out.println();
        System.out.println("after sorting");
        for(int n:nums)
        {
            System.out.print(n+ " ");
        }
    }

    
    public static void  quicksort(int nums[],int low,int high)
    {
        if (low<high)
        {
            int pivot=partition(nums,low,high);
            quicksort(nums, low, pivot-1);
            quicksort(nums ,pivot+1,high);
        }
    }
    public static int partition(int nums[],int low,int high)
    {
        int pivot=nums[high];
        int i=low-1;
        int j=low;
        int temp;
        for(j=low;j<high;j++)
        {
            if (nums[j]<pivot)
            {
                i++;
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;

            }
        }
        temp=nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;

        return i+1;
        
    }
}
