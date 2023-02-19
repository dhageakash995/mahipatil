package day5java;

public class Testdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vehicle v=new Vehicle();
		v.accelerate();
		v.applyBreaks();
		
		Car c = new Car();
		c.ADAS();
		c.airConditioner();
		//c.applyBreak();
		
		System.out.println(c.wheels);
		
	//	c.applyBreak();
		v.applyBreaks();
	
		Vehicle v1 = new Car();
		v1.accelerate();
		v1.applyBreaks();
		v1.applyBreaks();
		 Vehicle v2=new Vehicle();
		 v1.applyBreaks();
		 v2.applyBreaks();
		
		v1=new Auto();
		v1.accelerate();
	}

}
