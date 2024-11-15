

class Binary
{
    public static void main(String[] args) {
        int num[]= {5,7,9,11,13}; // sorted list
        int key=13;
        
       int result= binarySearch(num,key);
       if (result!=-1)
       System.out.println("Result is : "+ result);
       else
       System.out.println("not found");
    }

    public static int binarySearch(int[] num, int key) {
        int low=0;
        int high =num.length;
        
        while(low<=high) // while loop is for conditions and for loop is for iteration .
        {
           int mid = (low+high)/2;
           if(num[mid]==key)
             return mid;
            else if (key >num[mid])
             low=mid+1;
             else
             high= mid-1;
        }
  return -1;

}
}