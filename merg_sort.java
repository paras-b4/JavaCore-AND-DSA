class main
{
    public static void main(String[] args) {
        int nums []={8,6,9,2,3,4,10,13};
        for(int n: nums)
        {
          System.out.print(n+" ");
        }
        System.out.println();
        mergsort(nums,0, nums.length-1);
        for(int n: nums)
        {
          System.out.print(n+" ");
        }
        
    }

  
    public static void mergsort(int[] nums, int l, int r) {
      if(l<r)
      {
            int mid = (l+r)/2;
            mergsort(nums, l, mid);
            mergsort(nums, mid+ 1,r);
            merg(nums,l,mid,r);
          }
  
    }
    public static void merg(int[] nums,int l,int mid,int r)
    {
      int n1=mid-l+ 1;//if l is 0 and mid is 2, mid -l+1 results in 2 - 0 + 1= 3 meaning the left subway contains 3 elements
      int n2=r-mid;
      int larr[] =new int[n1];
      int rarr[] = new int [n2]; 

      for (int i=0;i<n1;++i)
      {
        larr[i]=nums[l+ i];

      }
      for (int j=0;j<n2;++j)
      {
        rarr[j]=nums[mid+ 1+j];

      }
     

      int i=0;
      int j=0;
      int k=l;
      while (i<n1 && j<n2) {
        if (larr[i]<=rarr[j])
        {
          nums[k]=larr[i];
          i++;
          k++;
        }
        else
        {
            nums[k]=rarr[j];
            j++;
            k++;
          }

        }
      
      while(i<n1)
        {
          nums[k]=larr[i];
          i++;
          k++;

        }
        while(j<n2)
        {
          nums[k]=rarr[j];
          j++;
          k++;
          
        }
        
      }

}      

