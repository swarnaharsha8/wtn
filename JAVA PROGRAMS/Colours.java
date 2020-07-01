import java.util.Scanner;
public class Colours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char code=sc.next().charAt(0);
		if(code=='R')
			System.out.println("Red");
		else if(code=='B')
			System.out.println("Blue");
		else if(code=='G')
				System.out.println("Green");
		else if(code=='O')
				System.out.println("Orange");
		else if(code=='Y')
				System.out.println("Yellow");
		else if(code=='W')
				System.out.println("White");
		else
			System.out.println("Invalid Code");

		}
		}
