package twocrosstwoarray;
import java.util.Scanner;
public class Twocrosstwoarray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a=new int[2][2];
		if(args.length<4)
			System.out.println("Please enter 4 integer numbers");
		else {
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=Integer.parseInt(args[2*i+j]);
				
			}
			
		}
		
		System.out.println("The given array is: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println(" ");
		}
		System.out.println("The reverse of the array is: ");
		for(int i=1;i>=0;i--)
		{
			for(int j=1;j>=0;j--)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println(" ");
		}
		
		}

	}

}
