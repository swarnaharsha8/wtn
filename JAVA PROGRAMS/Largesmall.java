package largesmall;
import java.util.Scanner;
public class Largesmall {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int i,temp=0,j;
	int[] a=new int[size];
	for(i=0;i<size;i++)
		a[i]=sc.nextInt();
	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("the maximum element of given array is "+ a[a.length-1]);
	System.out.println("the second maximum element of given array is "+ a[a.length-2]);
	System.out.println("the minimum element of given array is "+ a[0]);
	System.out.println("the second minimum element of given array is "+ a[1]);

}

}	