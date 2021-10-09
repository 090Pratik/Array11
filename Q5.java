//Q5. How to find kth smallest element from unsorted array


class Q5
{
       public static void main(String[] args)
	   {
	   
	    int [] ar = {12,14,10,11,8,16,5,15};
		
		int k=5;
		
		for(int i=0; i<ar.length-1; i++)
		{
		  for(int j=i+1; j<ar.length; j++)
		  {
		       if(ar[i]>ar[j])
			   {
			        int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
			   }
          }
          if(i==k-1)
		  {
		        System.out.println(k+"th smallest element is"+ar[i]);
          }

		
		}
	   		
	   }
}	   