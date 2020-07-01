
public class Command {
public static void main(String[] args) {
		// TODO Auto-generated method stub
if(args.length==0)
{
	System.out.println("NO VALUE");
}
else
{
	for(int i=0;i<args.length-1;i++)
	{
		System.out.println(args[i]+" ");
	}
	System.out.println(args[args.length-1]);
}
}
}