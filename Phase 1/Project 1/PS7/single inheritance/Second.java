package inheritance;

public class Second extends First{
	
	public void second1()
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Second obj = new Second();
		obj.first1();
		obj.second1();
		
	}

}
