package day5java;

public class CalculatorProg {

	
	public  void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,Double b)
	{
		System.out.println(a+b);
	}
	private  void add(Double d1,Double d2)
	{
		System.out.println(d1+d2);
	}
	private  void add(Double a,int b)
		{
			System.out.println(a+b);
		}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
	//	CalculatorProg.add(10,20);
		//CalculatorProg.add(10.2, 38);
		CalculatorProg c = new CalculatorProg();
		c.add(10.89,56.89 );
		c.add(2.4, 45);
		c.add(67, 89);
		c.add(23, 45, 78);
	} 
}


