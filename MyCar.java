package Week3Java;

public class MyCar
{

	public static void main(String[] args) 
	{
		Vehicle Vhl=new Vehicle();
		Vhl.applyBreak();
		
		Car cr=new Car();
		cr.handBreak();	
		cr.applyBreak();
		cr.soundHorn();
		
		BMW bmw = new BMW();
		bmw.applyBreak();
		bmw.handBreak();
		
 
	}

}
