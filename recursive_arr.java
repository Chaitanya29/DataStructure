
public class recursive_arr {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		int start = 0;
		printarr(arr,start, arr.length-1);
		
	}
	static void printarr(int []arr,int start, int end)
	{
		if(start==end)
		{
			System.out.print(arr[start]);
			return;
		}
		else
		{
			System.out.print(arr[start]+" ");
			printarr(arr, start+1, end);
		}
	}

}
