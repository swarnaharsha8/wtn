public class calculaevolume {
	int length;
	int breadth;
	int height;
	calculaevolume()
	{
		length=10;
		breadth=20;
		height=9;
	}
	int volume()
	{
		return length*breadth*height;
	}
	public static void main(String[] args) {
		calculaevolume v=new calculaevolume();
		int vol=v.volume();
		System.out.println("volume of the box is:"+vol);
	}
	}
	