package basics;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,40,45,34,23,67,84,56,58,9,77};
		int temp=0;
		for (int i=0;i<arr.length;i++)
		{
			if(temp<arr[i])
			{
				temp=arr[i];
			}
						}
		System.out.println("The greatest number of array is "+temp);

	}

}
