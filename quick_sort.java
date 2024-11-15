class main
{
    public static void main(String[] args) {
        int nums[]={8,6,4,7,9,3,5};
        quickSort(nums,0,nums.length-1);
        for(int n:nums)
        System.out.print(n);


    }
   public static void quickSort(int[] nums, int low, int high) {
    if (low<high)
    {
        int piv=partition(nums,low,high);
        quickSort(nums, low, piv-1);
        quickSort(nums, piv+1,high);

    }


       

    }
private static int partition(int[] nums, int low, int high) {
    int pivot=nums[high];
    int i=low-1;
   
    for (int j = low; j < high; j++) {
        if(nums[j]<pivot)
        {
            i++;
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]= temp;
        }
       
    }
    int temp=nums[i+1];
    nums[i+1]=nums[high];
    nums[high]=temp;

    return i+1;
    

    
    
}
}
