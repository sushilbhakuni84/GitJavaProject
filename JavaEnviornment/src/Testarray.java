
public class Testarray {

public static void min(int arr[])
	{
		
		int min = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		
		System.out.println("minimum no. in above array is ="+ min);
	}
public static void max(int arr[])
{
	int max= arr[0];
	for(int k=1; k<arr.length; k++)
	{
		if(max<arr[k])
		{
			max=arr[k];
		}
	}
	System.out.println("maximum no. in above array is ="+max);
}
	public static void main(String[] args) {
		
		//int a[]= {12,4,8,3,7};
			int a[]= new int[5];
			a[0]=12;
			a[1]=4;
			a[2]=8;
			a[3]=13;
			a[4]=7;
			
			for(int j=0; j<a.length; j++)
			{
				System.out.println(a[j]);
			}
			
	 min(a);
	max(a);		
			
	
			
	}

}
