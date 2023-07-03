package inheritance;

public class C extends First{
	
	public void hirar() {
		System.out.println("this child class inherit class First");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C();
		c.first1();
		c.hirar();

	}

}
