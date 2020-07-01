package charvoweldigit;
import java.util.Scanner;

public class charvowdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char var;
		var=sc.next().charAt(0);
		int cvar=var;
		if(cvar>=65 && cvar<=122)
			System.out.println("Alphabet");
		else if(cvar>=48 &&cvar<=57)
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}
}