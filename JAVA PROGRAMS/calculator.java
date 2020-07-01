public class calculator {
		static double powerInt(int num1,int num2) 
	     { 
	         return Math.pow(num1,num2); 
	     } 
	 static double powerDouble(double num1,double num2) 
	 { 
	     return Math.pow(num1,num2); 
	 } 
	 public static void main(String[] args)  
	 { 
	   System.out.println("power of double numbers: "+calculator.powerDouble(4.4,4.4)); 
	   System.out.println("power of int numbers: "+calculator.powerInt(5,12)); 
	 } 
}