package display;
import java.util.Scanner;
public class Displayvowels {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
char n1=sc.next().charAt(0);
char n2=sc.next().charAt(0);
int as1=n1;
int as2=n2;

if(as1>as2)
	System.out.println(n2 +" " +n1);
else
	System.out.println(n1 +" " +n2);
	}
}
