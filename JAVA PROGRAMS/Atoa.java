import java.util.Scanner;
public class Atoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
char var=sc.next().charAt(0);
if(var>='A'&&var<='Z')
	System.out.println(var + "->"+ Character.toLowerCase(var));
if(var>='a'&&var<='z')
	System.out.println(var + "->"+ Character.toUpperCase(var));
}

}