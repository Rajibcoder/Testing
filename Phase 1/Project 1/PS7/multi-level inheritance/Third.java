package inheritance;

public class Third extends Second{
	
	public void third1()
	{
		System.out.println("Grand child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Third obj = new Third();
		obj.first1();
		obj.second1();
		obj.third1();

	}

}
