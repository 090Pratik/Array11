
//q2 How to find the largest and smallest number in an unsorted
//array?

class AQ2{

         public static void main(String args[])
         {
            int arr[]={4,3,8,9,2,4,5,7,13};
			
            int min =arr[0];
            int max =arr[0];
			
            for (int i=0;i<arr.length; i++)
            {
               if(max<arr[i])
               {
                 max=arr[i];
               }
			   
               if(min>arr[i])
               {
                 min=arr[i];
               }


            }
              System.out.println("max no. is: "+max);
              System.out.println("min no. is: "+min);
        }
}