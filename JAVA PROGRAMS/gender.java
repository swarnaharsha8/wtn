package gender;

public class gender {
		public static void main(String[] args) 
		{
			String gender=args[0];
			int age=Integer.parseInt(args[1]);
			if(gender.contentEquals("m"))
			{
				if(age>=1&&age<=58)
					{
						System.out.println("8.2%");
					}
					else
					{
						System.out.println("10.2%"); 
					}
			}
			if(gender.contentEquals("f"))
			{
				if(age>=1&&age<=58)
					{
						System.out.println("8.5%");
					}
					else
					{
						System.out.println("11.2%"); 
					}
					
			}
		}
	}
