package assignment5;	//package declaration
abstract class Sum		//defining abstract class
{
	//abstract methods
	public abstract int SumOfTwo(int n1, int n2);
	public abstract int SumOfThree(int n1, int n2, int n3);
	//Regular method 
   	public void disp()
	{
		System.out.println("Method of class Sum");
   	}
}
public class Assignment5_1 extends Sum
{
	public int SumOfTwo(int num1, int num2)	//implementing the inherited abstract method Sum.SumOfTwo(int,int)
	{
		System.out.println("Sum of "+num1+" and "+num2);
		return num1+num2;
   	}
   	public int SumOfThree(int num1, int num2, int num3)	//implementing the inherited abstract method Sum.SumOfTwo(int,int,int)
	{
		System.out.println("Sum of "+num1+" , "+num2+" and "+num3);
		return num1+num2+num3;
   	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Assignment5_1 obj = new Assignment5_1();	//object and reference of Assignment5_1
		System.out.println(obj.SumOfTwo(3, 7));
		System.out.println(obj.SumOfThree(4, 3, 19));
		obj.disp();		//invoking regular method of parent class
	}

}