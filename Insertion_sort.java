class main
{
    public static void main(String[] args) {
        int nums[]={5,9,3,7,8};
        int key;
       int size= nums.length;

        for(int i=1;i<size;i++)
        {
            key= nums[i];
            int j=i-1;
            while(j>=0&&nums[j]>key)
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
        for (int n:nums)
        System.out.print(n);

    }
}
//(nums[j]>key) && (j>=0)
//j>=0&&nums[j]>key