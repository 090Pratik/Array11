
//How to find the first repeating element in an array of
//integers?

class Q8
{
	void printRepeating(int arr[])
	{
		int i, j;
		System.out.println("Repeated Elements are :");
		
		for (i = 0; i < arr.length-1; i++)
		{
			for (j = i + 1; j < arr.length; j++)
			{
				if (arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args)
	{
		Q8 repeat = new Q8();
		int arr[] = {4, 2, 4, 5, 2, 3, 1};
		
		repeat.printRepeating(arr);
	}
}