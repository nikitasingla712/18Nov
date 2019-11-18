import java.util.Scanner;
public class ArrayFreq 
{ 
public static void countFreq(int arr[], int n) 
{ 
	boolean visited[] = new boolean[n]; 
	for (int i = 0; i < n; i++) 
	{ 
		if (visited[i] == true) 
			continue; 
		int count = 1; 
		for (int j = i + 1; j < n; j++) 
		{ 
			if (arr[i] == arr[j]) 
			{ 
				visited[j] = true; 
				count++; 
			} 
		} 
		System.out.println(arr[i] + " " + count); 
	} 
} 
public static void main(String []args) 
{ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Array:"); 
	int n = sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter elements of Array:");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	countFreq(arr, n); 
} 
} 

