

class Main{
    public static void main(String[] args) {
        int num[] = {2,6,8,10,13};
       
        int key=10;
       int result= LinearSearch(num,key);
       if (result!=-1)
       System.out.println("value is : "+ result);
       else
       System.out.println(" not found in the array ");
    }
    public static int LinearSearch(int[] num, int key)
    {
        int size;
        for(int i=0;i<num.length;i++)
        {

            if (num[i]==key)
            
                return i;
         

        }
        return -1;
       
    }
   
    
   
        
    
 
    
}
